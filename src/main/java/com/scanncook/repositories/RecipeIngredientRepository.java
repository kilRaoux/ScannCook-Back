package com.scanncook.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.RecipeIngredient;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long>{

	public List<RecipeIngredient> findByRecipeid(long id);
}
