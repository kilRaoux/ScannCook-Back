package com.scanncook.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.scanncook.services.comment.CommentService;
import com.scanncook.services.comment.CommentServiceImpl;

@Configuration
public class CommentConfig {

	@Primary
	@Bean
	public CommentService newCommentService() {
		return new CommentServiceImpl();
	}
}
