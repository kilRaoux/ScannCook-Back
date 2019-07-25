package com.scanncook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.scanncook.services.IngredientService;

@RestController
public class IngredientController {
	
	@Autowired
	private IngredientService ingredientService;
}
