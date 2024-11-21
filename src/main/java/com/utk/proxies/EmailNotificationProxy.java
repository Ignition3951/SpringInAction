package com.utk.proxies;

import org.springframework.stereotype.Component;

import com.utk.model.Comment;

@Component
public class EmailNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Comment is sent in the mail!!!!!!" + comment.getText());
	}

}
