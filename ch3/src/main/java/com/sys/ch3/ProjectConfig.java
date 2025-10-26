package com.sys.ch3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sys.ch3")
public class ProjectConfig {

	@Bean
	public Parrot parrot1() {
		Parrot p = new Parrot();
		p.setName("Ko Ko");
		return p;
	}

	@Bean
	public Parrot parrot2() {
		Parrot p = new Parrot();
		p.setName("NIKi");
		return p;
	}

//	@Bean
//	public Person person(@Qualifier("parrot1") Parrot parrot2) {
//		Person person = new Person();
//		person.setName("Sue Sue");
////		person.setParrot(parrot()); // direct wiring
//		person.setParrot(parrot2);
//		return person;
//	}
}
