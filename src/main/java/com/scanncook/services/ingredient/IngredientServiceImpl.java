package com.scanncook.services.ingredient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.Ingredient;
import com.scanncook.repositories.ingredient.IngredientRepository;
import com.scanncook.repositories.product.ProductRepository;


@Service
public class IngredientServiceImpl implements IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	@Autowired
	private ProductRepository productRepository;
	
	public List<Ingredient> findAll(){
		return ingredientRepository.findAll();
	}
	
	public void save(Ingredient ingredient) {
		ingredientRepository.save(ingredient);
	}
	
	public boolean exist(Ingredient ingredient) {
		return !ingredientRepository.findByName(ingredient.getName()).isEmpty();
	}

	@Override
	public Ingredient findByCodebar(String codebar) {
		return productRepository.findByCodebar(codebar).getIngredient();
	}
}