package com.scanncook.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.scanncook.services.RecipeIngredientService;
import com.scanncook.services.implementation.RecipeCommentServiceImpl;
import com.scanncook.services.implementation.RecipeIngredientServiceImpl;

@Configuration
public class RecipeIngredientConfig {

	@Bean
	@Primary
	public RecipeIngredientService newRecipeIngredient() {
		return new RecipeIngredientServiceImpl();
	}
}
