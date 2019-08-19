package com.scanncook.services.recipe;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.Recipe;
import com.scanncook.models.RecipeIngredient;
import com.scanncook.models.Tag;
import com.scanncook.repositories.recipe.RecipeRepository;
import com.scanncook.services.recipe_ingredient.RecipeIngredientService;
import com.scanncook.services.tag.TagService;


@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private TagService tagService;
	
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
	
	public List<Recipe> findAllByTag(String tagName){
		return recipeRepository.findAllByTags(tagService.findByName(tagName));
		
	}
	
	public List<Tag> findTags(long id){
		Optional<Recipe> recipe = recipeRepository.findById(id);
		if (recipe.isPresent())
			return recipe.get().getTags();
		else
			return new ArrayList<Tag>();
	}

	public void update(Recipe recipe) {
		recipeRepository.delete(recipe);
		recipeRepository.save(recipe);
	}
}
