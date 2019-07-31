package com.scanncook.services.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.Comment;
import com.scanncook.repositories.comment.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository recipeCommentRepository;
	
	public void save(Comment comment) {
		recipeCommentRepository.save(comment);
	}
}
