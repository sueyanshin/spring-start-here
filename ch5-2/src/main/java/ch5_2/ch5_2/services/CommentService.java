package ch5_2.ch5_2.services;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch5_2.ch5_2.repositories.CommentRepository;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {

	// singleton -> should be immutable
	private final CommentRepository commentRepository;

	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
		System.out.println("CommentService instance created!");
	}

	public CommentRepository getCommentRepository() {
		return commentRepository;
	}

}
