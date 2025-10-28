package ch5_2.ch5_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch5_2.ch5_2.services.CommentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//		var cmtBean1 = context.getBean(CommentService.class);
//		var cmtBean2 = context.getBean(CommentService.class);
//
//		var b = cmtBean1 == cmtBean2;
//
//		System.out.println(b);

//		var commentService = context.getBean(CommentService.class);
//		var userService = context.getBean(UserService.class);
//
//		var b = commentService.getCommentRepository() == userService.getCommentRepository();
//
//		System.out.println("both use one instance in context: " + b);

//		System.out.println("Before using the CommentService");
//		var commentService = context.getBean(CommentService.class);
//		System.out.println("After using the CommentService");

		// Prototype

		var cs1 = context.getBean(CommentService.class);
		var cs2 = context.getBean(CommentService.class);

		var b = cs1 == cs2;

		System.out.println(b);
	}
}
