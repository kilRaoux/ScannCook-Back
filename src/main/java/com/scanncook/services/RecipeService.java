package com.scanncook.services;

import java.util.List;
import java.util.Optional;

import com.scanncook.models.Recipe;

public interface RecipeService {

	public List<Recipe> findAll();
	public Optional<Recipe> findById(Long id);
	public void save  (Recipe recipe);
	public void delete(Recipe recipe);
}