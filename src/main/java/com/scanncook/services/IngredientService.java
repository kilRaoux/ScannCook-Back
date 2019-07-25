package com.scanncook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.repositories.IngredientRepository;


@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
}
