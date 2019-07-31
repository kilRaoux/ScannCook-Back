package com.scanncook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.Recipe;
import com.scanncook.repositories.custom.RecipeCustomRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long>, RecipeCustomRepository {

}
