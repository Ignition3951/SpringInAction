package com.utk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.utk.model.Comment;
import com.utk.proxies.CommentNotificationProxy;
import com.utk.repositories.CommentRepository;

@Component
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private CommentNotificationProxy commentNotificationProxy;

	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}

}
