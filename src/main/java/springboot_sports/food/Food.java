package springboot_sports.food;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import springboot_sports.sports.Sports;

@Entity
public class Food {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Sports sports;
	
	public Food (String id, String name, String description, String sportId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.sports = new Sports (sportId, "", "");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Sports getSports() {
		return sports;
	}

	public void setSports(Sports sports) {
		this.sports = sports;
	}

}
