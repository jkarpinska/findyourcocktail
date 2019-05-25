package com.findyourcocktail.ingredient;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
	
	public List<Ingredient> findByCocktail(String cockatil);
	
	public List<Ingredient> findByProduct(String product);
	
	

}
