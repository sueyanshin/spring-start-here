package com.sys.repositories;

import org.springframework.stereotype.Repository;

import com.sys.models.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());

	}

}
