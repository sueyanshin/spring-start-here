package com.sys.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.sys.ch6.Comment;

@Service
public class CommentService {

	private Logger logger = Logger.getLogger(CommentService.class.getName());

//	public void publishComment(Comment comment) {
//		logger.info("Publishing comment:" + comment.getText());
//	}

	public String publishComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		return "SUCCESS";
	}
}
