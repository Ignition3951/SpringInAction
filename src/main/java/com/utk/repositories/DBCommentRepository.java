package com.utk.repositories;

import com.utk.model.Comment;

public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Comment is stored in the DB!!!!!!" + comment.getText());
	}

}
