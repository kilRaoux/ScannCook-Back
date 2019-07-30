package com.scanncook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.RecipeComment;

public interface RecipeCommentRepository extends JpaRepository<RecipeComment, Long>{

}
