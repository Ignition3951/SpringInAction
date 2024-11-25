package com.utk.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.utk.model.Comment;
import com.utk.proxies.CommentNotificationProxy;
import com.utk.repositories.CommentRepository;

@Service
public class CommentService {

	private Logger logger = Logger.getLogger(CommentService.class.getName());

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	@Qualifier("EMAIL")
	private CommentNotificationProxy commentNotificationProxy;

	public String publishComment(Comment comment) {
		logger.info("Comment published by : " + comment.getAuthor());
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
		return "SUCCESS";
	}

}
