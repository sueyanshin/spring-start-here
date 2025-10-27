package com.sys.services;

import org.springframework.stereotype.Component;

import com.sys.models.Comment;
import com.sys.proxies.CommentNotificationProxy;
import com.sys.repositories.CommentRepository;

@Component
public class CommentService {

	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;

	public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;

	}

	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}

}
