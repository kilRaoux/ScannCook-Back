package com.scanncook.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.scanncook.models.Ingredient;
import com.scanncook.models.User;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
	
	//@Query("SELECT CASE WHEN COUNT(i) > 0 THEN true ELSE false END FROM ingredient i WHERE i.name = name")
	//public boolean existByName(@Param("name") String name);
	
	//@Query("SELECT * FROM ingredient WHERE ingredient.name = name")
	public List<Ingredient> findByName(@Param("name") String name);
}
