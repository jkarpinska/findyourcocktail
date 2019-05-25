package com.findyourcocktail.cocktail;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cocktail {
	@Id
	private String id;
	private String name;
	private String description;
	private String type;

	
	public Cocktail() {
		
	}
	
	public Cocktail(String id, String name, String recipe, String type) {
		this.id = id;
		this.name = name;
		this.description = recipe;
		this.type = type;

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

	public String getRecipe() {
		return description;
	}

	public void setRecipe(String recipe) {
		this.description = recipe;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
