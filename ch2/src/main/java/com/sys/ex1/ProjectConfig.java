package com.sys.ex1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.sys.ex1")
@Configuration
public class ProjectConfig {
//
//	@Bean
//	@Primary
//	Parrot parrot() {
//		var p = new Parrot();
//		p.setName("Ko Ko");
//		return p;
//	}
//
//	@Bean
//	String hello() {
//		return "Hello Spring dev";
//	}
//
//	@Bean
//	Integer age() {
//		return 11;
//	}
//
////	Ex 3
//
//	@Bean(name = "eiei")
//	Parrot parrot1() {
//		var p = new Parrot();
//		p.setName("Ei Ei");
//		return p;
//	}
//
//	@Bean(value = "seinsein")
//	Parrot parrot2() {
//		var p = new Parrot();
//		p.setName("Sein Sein");
//		return p;
//	}
//
//	@Bean("aungkhant")
//	Parrot parrot3() {
//		var p = new Parrot();
//		p.setName("Aung Khant");
//		return p;
//	}
}
