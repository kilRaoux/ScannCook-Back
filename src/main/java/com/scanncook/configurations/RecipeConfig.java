package com.scanncook.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.scanncook.services.RecipeService;
import com.scanncook.services.implementation.RecipeServiceImpl;

@Configuration
public class RecipeConfig {

	@Bean
	@Primary
	public RecipeService newService() {
		return new RecipeServiceImpl();
	}
}
