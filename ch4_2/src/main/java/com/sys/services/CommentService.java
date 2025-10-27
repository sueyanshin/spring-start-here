package com.sys.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sys.models.Comment;
import com.sys.proxies.CommentNotificationProxy;
import com.sys.repositories.CommentRepository;

@Service
public class CommentService {

	private CommentRepository commentRepository;

	private CommentNotificationProxy commentNotificationProxy;

	public CommentService(CommentRepository commentRepository,
			@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}

	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}

}
