package com.findyourcocktail.ingredient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientController {
	
	@Autowired
	private IngredientService ingredientService;

	@RequestMapping("/cocktails/{cocktail}/ingredients")
	public List<Ingredient> getAllIngredients(@PathVariable String cocktail){
		return ingredientService.getAllIngredients(cocktail);
	}
	
	@GetMapping(path="/cocktails/{cocktail}/ingredients/{id}")
	public Ingredient getIngredient(@PathVariable String id) {
		return ingredientService.getIngredient(id);
	}
	

	
}
