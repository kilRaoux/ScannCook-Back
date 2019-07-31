package com.scanncook.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.scanncook.models.Ingredient;
import com.scanncook.models.RecipeIngredient;
import com.scanncook.repositories.RecipeIngredientRepository;
import com.scanncook.repositories.IngredientRepository;


@Service
public class IngredientServiceImpl {
	
	@Autowired
	private IngredientRepository ingredientRepository;

	
	public List<Ingredient> findAll(){
		return ingredientRepository.findAll();
	}
	
	public void save(Ingredient ingredient) {
		ingredientRepository.save(ingredient);
	}
	
	public boolean exist(Ingredient ingredient) {
		return !ingredientRepository.findByName(ingredient.getName()).isEmpty();
	}
}