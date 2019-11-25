package springboot_sports.food;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface FoodRepository extends CrudRepository<Food, String> {
	
	public List<Food> findBySportsId (String sportsId);

}
