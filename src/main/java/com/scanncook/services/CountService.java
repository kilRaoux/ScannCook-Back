package com.scanncook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.IngredientCount;
import com.scanncook.repositories.IngredientCountRepository;

@Service
public class CountService {

	@Autowired
	private IngredientCountRepository countRepository;
	
	@Autowired
	private IngredientService ingredientService;
	
	public void save(IngredientCount count) {
		countRepository.save(count);
	}
}
