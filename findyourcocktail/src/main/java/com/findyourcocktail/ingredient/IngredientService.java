package com.findyourcocktail.ingredient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;

	public List<Ingredient> getAllIngredients(String cocktail){
		List<Ingredient> ingredients = new ArrayList<>();
		ingredientRepository.findByCocktail(cocktail).forEach(ingredients::add);
		
		return ingredients;
	}
	
	public Ingredient getIngredient(String id) {
		return ingredientRepository.findById(Integer.parseInt(id)).get();
	}
	
	public void addIngredient(Ingredient ingredient) {
		ingredientRepository.save(ingredient);
	}
	
	public void updateIngredient(Ingredient ingredient) {
		ingredientRepository.save(ingredient);
	}
	
	public void deleteCocktail(String id) {
		ingredientRepository.delete(ingredientRepository.findById(Integer.parseInt(id)).get());
	}
	
	public List<Ingredient> findByProduct(String product){
		List<Ingredient> list = new ArrayList<>();
		ingredientRepository.findByProduct(product).forEach(list::add);
		return list;
	}

}
