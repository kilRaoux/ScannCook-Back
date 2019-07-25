package com.scanncook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
