package com.utk.main;

import com.utk.model.Comment;
import com.utk.proxies.CommentNotificationProxy;
import com.utk.proxies.EmailNotificationProxy;
import com.utk.repositories.CommentRepository;
import com.utk.repositories.DBCommentRepository;
import com.utk.service.CommentService;

public class CommentMain {

	public static void main(String[] args) {

		CommentRepository commentRepository = new DBCommentRepository();
		CommentNotificationProxy commentNotificationProxy = new EmailNotificationProxy();

		CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

		Comment comment = new Comment();
		comment.setAuthor("Utkarsh");
		comment.setText("Demo text!!!!!!!!");

		commentService.publishComment(comment);

	}

}
