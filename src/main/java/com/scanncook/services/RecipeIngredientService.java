package com.scanncook.services;

import java.util.List;

import com.scanncook.models.Recipe;
import com.scanncook.models.RecipeIngredient;

public interface RecipeIngredientService {

	public List<RecipeIngredient> findAllByRecipeid(long id);

	public void save(RecipeIngredient count, long id);
}
