package com.scanncook.services.implementation;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.RecipeIngredient;
import com.scanncook.models.Recipe;
import com.scanncook.repositories.RecipeRepository;
import com.scanncook.services.RecipeIngredientService;
import com.scanncook.services.RecipeService;


@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private RecipeIngredientService recipeIngredientService;
	
	public List<Recipe> findAll() {
		// TODO Auto-generated method stub
		return build(recipeRepository.findAll());
	}

	public Optional<Recipe> findById(Long id) {
		// TODO Auto-generated method stub
		return recipeRepository.findById(id);
	}

	public void save(Recipe recipe) {
		recipe.setCreationdate(new Date(Calendar.getInstance().getTime().getTime()));
		recipe = recipeRepository.save(recipe);
		if(recipe.getIngredients()!=null)
			for(RecipeIngredient count: recipe.getIngredients()) {
				recipeIngredientService.save(count, (long)recipe.getId());
			}
		
		
	}

	public void delete(Recipe recipe) {
		recipeRepository.delete(recipe);
		
	}
	
	public Recipe build(Recipe recipe) {
		recipe.setIngredients(recipeIngredientService.findAllByRecipeid(recipe.getId()));
		return recipe;
	}
	
	public List<Recipe> build(List<Recipe> recipes){
		for(Recipe recipe:recipes) {
			build(recipe);
		}
		return recipes;
	}

}
