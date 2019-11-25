package springboot_sports.food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	public List<Food> getAllFood(String sportsId){
		List<Food> food = new ArrayList<>();
		foodRepository.findBySportsId(sportsId).forEach(food::add);
		return food;
		
	}

	public Food getFood(String foodId) {
		return foodRepository.findById(foodId).get();
	}

	public void addFood(Food food) {
		foodRepository.save(food);
	}
	
	public void updateFood(Food food) {
		foodRepository.save(food);
	}

	public void deleteFood(String foodId) {
		foodRepository.deleteById(foodId);
		
	}
}
