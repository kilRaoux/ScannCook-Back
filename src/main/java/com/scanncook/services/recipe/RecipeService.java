package com.scanncook.services.recipe;

import java.util.List;
import java.util.Optional;

import com.scanncook.models.Recipe;
import com.scanncook.models.Tag;

public interface RecipeService {

	public List<Recipe> findAll();
	public Optional<Recipe> findById(Long id);
	public void save  (Recipe recipe);
	public void delete(Recipe recipe);
	public List<Tag> findTags(long id);
	public void update(Recipe recipe);
}