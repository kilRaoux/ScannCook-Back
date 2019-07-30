package com.scanncook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.IngredientCount;

public interface IngredientCountRepository extends JpaRepository<IngredientCount, Long>{
}
