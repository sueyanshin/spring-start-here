package com.sys.ch6_ex6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sys.ch6_ex6.config.ProjectConfig;
import com.sys.ch6_ex6.models.Comment;
import com.sys.ch6_ex6.services.CommentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		CommentService service = context.getBean(CommentService.class);

		Comment comment = new Comment();
		comment.setAuthor("sue yan");
		comment.setText("hello from japan");
		var value = service.publishComment(comment);
		System.out.println("Get the value from main:" + value);

	}
}
