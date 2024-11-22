package com.utk.repositories;

import org.springframework.stereotype.Repository;

import com.utk.model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Comment is stored in the DB!!!!!!" + comment.getText());
	}

}
