package com.utk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.utk.model.Comment;
import com.utk.proxies.CommentNotificationProxy;
import com.utk.repositories.CommentRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	@Qualifier("EMAIL")
	private CommentNotificationProxy commentNotificationProxy;

	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}

}
