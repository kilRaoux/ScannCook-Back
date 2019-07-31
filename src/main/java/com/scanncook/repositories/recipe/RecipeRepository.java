package com.scanncook.repositories.recipe;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.Recipe;
import com.scanncook.models.Tag;

public interface RecipeRepository extends JpaRepository<Recipe, Long>, RecipeCustomRepository {

	public List<Recipe> findAllByTags(Optional<Tag> optional);
}
