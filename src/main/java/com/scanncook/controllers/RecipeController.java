package com.scanncook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.scanncook.services.RecipeService;

@RestController
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
}
