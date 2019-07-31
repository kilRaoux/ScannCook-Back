package com.scanncook.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.RecipeComment;
import com.scanncook.models.RecipeIngredient;
import com.scanncook.repositories.RecipeCommentRepository;
import com.scanncook.services.RecipeIngredientService;

@Service
public class RecipeCommentServiceImpl{

	@Autowired
	private RecipeCommentRepository recipeCommentRepository;
	
	public void save(RecipeComment comment) {
		recipeCommentRepository.save(comment);
	}
}
