package com.sys.ch3;

public class Parrot {
	private String name;
	private int age;

	public Parrot() {
		System.out.println("Parrot created.");
	}

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

	@Override
	public String toString() {
		return "Parrot :" + this.name;
	}
}
