package com.sys.proxies;

import org.springframework.stereotype.Component;

import com.sys.models.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for comment:" + comment.getText());
	}

}
