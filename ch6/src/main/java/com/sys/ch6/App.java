package com.sys.ch6;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sys.services.CommentService;

/**
 * Hello world!
 *
 */
public class App {

	private static Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Comment comment = new Comment();
		comment.setAuthor("Sue Sue");
		comment.setText("This is a comment");

		CommentService service = context.getBean(CommentService.class);
//		service.publishComment(comment);

		String value = service.publishComment(comment);

		logger.info(value);
	}
}
