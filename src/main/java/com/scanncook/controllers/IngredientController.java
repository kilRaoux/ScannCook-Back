package com.scanncook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scanncook.models.Ingredient;
import com.scanncook.repositories.RecipeIngredientRepository;
import com.scanncook.services.implementation.IngredientServiceImpl;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
	
	@Autowired
	private IngredientServiceImpl ingredientService;
	
	@GetMapping("")
	public List<Ingredient> findAll() {
		return ingredientService.findAll();
	}
	
	@PostMapping("")
	public void save(@RequestBody Ingredient ingredient) {
		ingredientService.save(ingredient);
	}
	
	
}
