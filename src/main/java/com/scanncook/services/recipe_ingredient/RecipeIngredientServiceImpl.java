package com.scanncook.services.recipe_ingredient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.RecipeIngredient;
import com.scanncook.repositories.RecipeIngredientRepository;
import com.scanncook.repositories.ingredient.IngredientRepository;

@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService{

	@Autowired
	private RecipeIngredientRepository recipeIngredientRepository;
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
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
