package com.scanncook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.RecipeComment;
import com.scanncook.repositories.RecipeCommentRepository;

@Service
public class RecipeCommentService {

	@Autowired
	private RecipeCommentRepository recipeCommentRepository;
	
	public void save(RecipeComment comment) {
		recipeCommentRepository.save(comment);
	}
}
