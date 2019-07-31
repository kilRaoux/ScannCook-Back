package com.scanncook.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.RecipeIngredient;
import com.scanncook.models.Ingredient;
import com.scanncook.models.Recipe;
import com.scanncook.repositories.IngredientRepository;
import com.scanncook.repositories.RecipeIngredientRepository;
import com.scanncook.services.RecipeIngredientService;

@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService{

	@Autowired
	private RecipeIngredientRepository recipeIngredientRepository;
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	@Autowired
	private IngredientServiceImpl ingredientService;
	
	public void save(RecipeIngredient count, long recipeid) {
		count.setRecipeid(recipeid);
		RecipeIngredient ri = recipeIngredientRepository.save(count);
		System.out.println("RI:::::"+ri);
	}

	public List<RecipeIngredient> findAllByRecipeid(long id) {
		List<RecipeIngredient> result =  recipeIngredientRepository.findByRecipeid(id);
		return build(result);
	}
	
	private RecipeIngredient build(RecipeIngredient ri) {
		ri.setIngredient(ingredientRepository.findById(ri.getIngredientid()));
		return ri;
	}
	
	private List<RecipeIngredient> build(List<RecipeIngredient> ris){
		for (RecipeIngredient recipeIngredient : ris) {
			build(recipeIngredient);
		}
		return ris;
	}
}
