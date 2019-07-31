package com.scanncook.repositories.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
