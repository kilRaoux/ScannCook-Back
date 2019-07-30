package com.scanncook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.scanncook.models.Ingredient;
import com.scanncook.models.IngredientCount;
import com.scanncook.repositories.IngredientCountRepository;
import com.scanncook.repositories.IngredientRepository;


@Service
public class IngredientService {
	
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