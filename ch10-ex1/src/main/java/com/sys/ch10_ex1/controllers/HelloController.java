package com.sys.ch10_ex1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello spring";
	}

	@GetMapping("/ciao")
	public String ciao() {
		return "ciao!";
	}
}
