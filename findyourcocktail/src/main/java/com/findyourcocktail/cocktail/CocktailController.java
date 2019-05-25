package com.findyourcocktail.cocktail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findyourcocktail.ingredient.Cocktail;

@RestController
public class CocktailController {
	
	@Autowired
	private CocktailService cocktailService;

	@RequestMapping("/cocktails")
	public List<Cocktail> getAllCocktails(){
		return cocktailService.getAllCocktails();
	}
	
	@GetMapping(path="/cocktails/{id}")
	public Cocktail getCocktail(@PathVariable String id) {
		return cocktailService.getCocktail(id);
	}
	
	/*
	 * @GetMapping(path="/cocktails/search/{product}") public List<Cocktail>
	 * getCocktailsByProduct(@PathVariable String product){ return
	 * ingredientService.findByProduct(product); }
	 */
	
	
}
