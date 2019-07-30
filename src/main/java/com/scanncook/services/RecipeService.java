package com.scanncook.services;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.IngredientCount;
import com.scanncook.models.Recipe;
import com.scanncook.repositories.RecipeRepository;


@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private CountService countService;
	
	public List<Recipe> getAll() {
		// TODO Auto-generated method stub
		return recipeRepository.findAll();
	}

	public Optional<Recipe> getById(Long id) {
		// TODO Auto-generated method stub
		return recipeRepository.findById(id);
	}

	public void save(Recipe recipe) {
		recipe.setCreationdate(new Date(Calendar.getInstance().getTime().getTime()));
		if(recipe.getIngredientCounts()!=null)
			for(IngredientCount count: recipe.getIngredientCounts()) {
				countService.save(count);
			}
		recipeRepository.save(recipe);
		
	}

	public void delete(Recipe recipe) {
		recipeRepository.delete(recipe);
		
	}

}
