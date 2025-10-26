package com.sys.ch3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Person p = context.getBean(Person.class);
		System.out.println("Person is: " + p.getName());
		System.out.println("His parrot is:" + p.getParrot());
	}
}
