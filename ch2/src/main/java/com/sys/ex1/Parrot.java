package com.sys.ex1;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
	public String name;
	public int age;

//	@PostConstruct
//	public void giveName() {
//		this.name = "Ke Ke is borned.";
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
