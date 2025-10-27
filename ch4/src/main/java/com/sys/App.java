package com.sys;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sys.models.Comment;
import com.sys.services.CommentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Comment comment = new Comment();
		comment.setAuthor("Sue Sue");
		comment.setText("I can study all day");

		var commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}
}
