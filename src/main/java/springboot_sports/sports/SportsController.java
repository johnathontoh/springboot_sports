package springboot_sports.sports;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportsController {
	
	@Autowired
	private SportsService sports;
	
	@RequestMapping("/sports")
	public List<Sports> getAllSports(){
		return sports.getAllSports();
	}
	
	@RequestMapping("/sports/{id}")
	public Sports getSports(@PathVariable String id) {
		return sports.getSports(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/sports")
	public void addSports(@RequestBody Sports sport) {
		sports.addSports(sport);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/sports/{id}" )
	public void updateSports(@RequestBody Sports sport, @PathVariable String id) {
		sports.updateSports(id, sport);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/sports/{id}")
	public void deleteSports(@RequestBody Sports sport, @PathVariable String id) {
		sports.deleteSports(id);
	}
	
}
