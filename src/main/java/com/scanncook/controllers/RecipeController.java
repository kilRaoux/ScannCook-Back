package com.scanncook.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scanncook.models.Recipe;
import com.scanncook.models.RecipeSearch;
import com.scanncook.services.RecipeService;
import com.scanncook.services.implementation.RecipeServiceImpl;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	
	@GetMapping("")
	public List<Recipe> findAll(){
		return recipeService.findAll();
	}

	@PostMapping("")
	public void save(@RequestBody Recipe recipe) {
		recipeService.save(recipe);
	}
	
	@DeleteMapping("")
	public void delete(@RequestBody Recipe recipe) {
		recipeService.delete(recipe);
	}
	
	@GetMapping("/{id}")
	public Optional<Recipe> findById(@PathVariable Long id) {
		return recipeService.findById(id);
	}
	
	@GetMapping("/title/{title}")
	public Optional<Recipe> getByTitle(@PathVariable String title){
		return null;
	}
	
	@GetMapping("/search")
	public List<Recipe> search(@RequestBody RecipeSearch recipeSearch){
		System.out.println(recipeSearch);
		return null;
		
	}
	
}
