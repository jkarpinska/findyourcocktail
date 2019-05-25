package com.findyourcocktail.ingredient;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredient {
	@Id
	private int id;
	private String cocktail;
	private String ingredient;
	private int amount;
	private String unit;

	
	public Ingredient() {
		
	}
	
	public Ingredient(int id, String name, String ingredient, int amount, String category) {
		this.id = id;
		this.cocktail = name;
		this.ingredient = ingredient;
		this.amount = amount;
		this.unit = category;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return cocktail;
	}

	public void setName(String name) {
		this.cocktail = name;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
	

}
