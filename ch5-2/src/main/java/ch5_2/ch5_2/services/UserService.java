package ch5_2.ch5_2.services;

import org.springframework.stereotype.Service;

import ch5_2.ch5_2.repositories.CommentRepository;

@Service
public class UserService {

	private CommentRepository commentRepository;

	public UserService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
