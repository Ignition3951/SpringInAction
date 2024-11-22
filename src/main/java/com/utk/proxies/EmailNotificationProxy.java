package com.utk.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.utk.model.Comment;

@Component
@Qualifier("EMAIL")
public class EmailNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Comment is sent in the mail!!!!!!" + comment.getText());
	}

}
