package com.findyourcocktail.cocktail;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocktailService {
	
	@Autowired
	private CocktailRepository cocktailRepository;

	public List<Cocktail> getAllCocktails(){
		List<Cocktail> cocktails = new ArrayList<>();
		cocktailRepository.findAll().forEach(cocktails::add);
		
		return cocktails;
	}
	
	public Cocktail getCocktail(String id) {
		return cocktailRepository.findById(id).get();
	}
	
	public void addCocktail(Cocktail cocktail) {
		cocktailRepository.save(cocktail);
	}
	
	public void updateCocktail(Cocktail cocktail) {
		cocktailRepository.save(cocktail);
	}
	
	public void deleteCocktail(String id) {
		cocktailRepository.delete(cocktailRepository.findById(id).get());
	}

}
