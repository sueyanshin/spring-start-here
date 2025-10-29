package com.sys.ch6_ex6.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.sys.ch6_ex6.aspects.ToLog;
import com.sys.ch6_ex6.models.Comment;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());

	@ToLog
	public String publishComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		return "SUCCESS";
	}

}
