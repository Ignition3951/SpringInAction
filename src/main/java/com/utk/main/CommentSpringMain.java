package com.utk.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utk.config.ProjectConfig;
import com.utk.model.Comment;
import com.utk.service.CommentService;

public class CommentSpringMain {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ProjectConfig.class)) {
			Comment comment = new Comment();
			comment.setAuthor("Utkarsh Spring framework");
			comment.setText("Demo text using framework!!!!!!!!");

			CommentService commentService = applicationContext.getBean(CommentService.class);
			System.out.println(commentService.getClass());
			commentService.publishComment(comment);
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
