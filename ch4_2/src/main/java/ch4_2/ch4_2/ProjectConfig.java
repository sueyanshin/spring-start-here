package ch4_2.ch4_2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.sys.proxies", "com.sys.repositories", "com.sys.services" })
public class ProjectConfig {

//	@Bean
//	public CommentRepository commentRepository() {
//		return new DBCommentRepository();
//	}
//
//	@Bean
//	public CommentNotificationProxy commentNotificationProxy() {
//		return new EmailCommentNotificationProxy();
//	}
//
//	@Bean
//	public CommentService commentService(CommentRepository commentRepository,
//			CommentNotificationProxy commentNotificationProxy) {
//		return new CommentService(commentRepository, commentNotificationProxy);
//	}
}
