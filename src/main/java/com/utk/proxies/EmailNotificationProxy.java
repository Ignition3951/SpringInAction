package com.utk.proxies;

import com.utk.model.Comment;

public class EmailNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Comment is sent in the mail!!!!!!" + comment.getText());
	}

}
