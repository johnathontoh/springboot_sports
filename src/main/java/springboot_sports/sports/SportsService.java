package springboot_sports.sports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SportsService {

	private List<Sports> sports = new ArrayList<>(Arrays.asList(
			new Sports ("basketball", "Basketball", "Basketball Description"),
			new Sports ("tennis", "Tennis", "Tennis Description"),
			new Sports ("soccer", "Soccer", "Soccer Description")
			));
	
	public List<Sports> getAllSports(){
		return sports;
	}

	public Sports getSports(String id) {
		return sports.stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}
	
	public void addSports(Sports sport) {
		sports.add(sport);
	}

	public void updateSports(String id, Sports sport) {
		for (int i=0; i<sports.size(); i++ ) {
			Sports s = sports.get(i);
			if (s.getId().equals(id)) {
				sports.set(i, sport);
				return;
			}
		}
		
	}

	public void deleteSports(String id) {
		sports.removeIf(s -> s.getId().equals(id));
		
	}
		
	
}
