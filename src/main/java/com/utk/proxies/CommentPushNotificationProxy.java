package com.utk.proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.utk.model.Comment;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Comment is sent through the push notification!!!!!!" + comment.getText());
	}

}
