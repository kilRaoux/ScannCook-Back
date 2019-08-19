package com.scanncook.services.ingredient;

import java.util.List;

import com.scanncook.models.Ingredient;

public interface IngredientService {
	public List<Ingredient> findAll();
	
	public void save(Ingredient ingredient);
	
	public boolean exist(Ingredient ingredient);
	
	public Ingredient findByCodebar(String codebar);
}
