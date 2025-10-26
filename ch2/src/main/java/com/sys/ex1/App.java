package com.sys.ex1;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Parrot p = context.getBean(Parrot.class);

//		String s = context.getBean(String.class);
//		Integer i = context.getBean(Integer.class);

//        System.out.println(p.getName());
//        System.out.println(s);
//        System.out.println(i);

//		Parrot p1 = context.getBean("eiei", Parrot.class);
//		Parrot p2 = context.getBean("seinsein", Parrot.class);
//		Parrot p3 = context.getBean("aungkhant", Parrot.class);

//		System.out.println(p.getName());

//		Defining bean programmatically
		Parrot myParrot = new Parrot();
		myParrot.setName("Riki");

		Supplier<Parrot> parrotSupplier = () -> myParrot;

		context.registerBean("myParrotLay", Parrot.class, parrotSupplier);
		context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

		Parrot pp = context.getBean(Parrot.class);
		System.out.println(pp.getName());

	}
}
