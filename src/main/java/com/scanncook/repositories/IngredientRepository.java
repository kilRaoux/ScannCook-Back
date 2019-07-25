package com.scanncook.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.Ingredient;
import com.scanncook.models.User;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

	public Optional<User> findByTitle(String title);
}
