package com.utk.main;

import java.util.logging.Logger;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utk.config.ProjectConfig;
import com.utk.model.Comment;
import com.utk.service.CommentService;

public class CommentSpringMain {

	private static Logger logger = Logger.getLogger(CommentSpringMain.class.getName());

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ProjectConfig.class)) {
			Comment comment = new Comment();
			comment.setAuthor("Utkarsh Spring framework");
			comment.setText("Demo text using framework!!!!!!!!");

			CommentService commentService = applicationContext.getBean(CommentService.class);
			String value = commentService.publishComment(comment);
			logger.info("Value in main : " + value);

		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
