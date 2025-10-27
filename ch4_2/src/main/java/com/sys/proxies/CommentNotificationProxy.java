package com.sys.proxies;

import com.sys.models.Comment;

public interface CommentNotificationProxy {

	void sendComment(Comment comment);

}
