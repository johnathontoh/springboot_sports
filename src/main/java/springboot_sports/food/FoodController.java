package springboot_sports.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot_sports.sports.Sports;


@RestController
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("/sports/{sportsId}/food")
	public List<Food> getAllFood(@PathVariable String sportsId){
		return foodService.getAllFood(sportsId);
		
	}
	
	@RequestMapping("/sports/{sportsId}/food/{foodId}")
	public Food getFood(@PathVariable String foodId ) {
		return foodService.getFood(foodId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/sports/{sportsId}/food")
	public void addFood(@RequestBody Food food, @PathVariable String sportsId) {
		food.setSports(new Sports (sportsId, "", ""));
		foodService.addFood(food);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/sports/{sportsId}/food/{foodId}")
	public void updateFood (@RequestBody Food food, @PathVariable String sportsId) {
		food.setSports(new Sports (sportsId, "", ""));
		foodService.updateFood(food);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/sports/{sportsId}/food/{foodId}")
	public void deleteFood (@PathVariable String foodId) {
		foodService.deleteFood(foodId);
	}
}
