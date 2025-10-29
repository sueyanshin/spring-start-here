package com.sys.ch6_3.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.sys.ch6_3.aspects.ToLog;
import com.sys.ch6_3.models.Comment;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());

	@ToLog
	public String publishComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		return "SUCCESS";
	}

//	public void deleteComment(Comment comment) {
//		logger.info("Deleting comment: " + comment.getText());
//	}
//
//	public void editComment(Comment comment) {
//		logger.info("Editing comment: " + comment.getText());
//	}

}
