package com.sys.ch6_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sys.ch6_3.config.ProjectConfig;
import com.sys.ch6_3.models.Comment;
import com.sys.ch6_3.services.CommentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Comment comment = new Comment();
		comment.setAuthor("Sue Yan Shin");
		comment.setText("Good morning");

		CommentService cmtService = context.getBean(CommentService.class);

		var value = cmtService.publishComment(comment);
//		cmtService.editComment(comment);
//		cmtService.deleteComment(comment);
		System.out.println("Get the value in main: " + value);
	}
}
