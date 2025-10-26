package com.sys.ch8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

	@GetMapping("/home/{color}") // {color} for pathVariable
	public String home(
//			@RequestParam(required = false) String color, 
//			@RequestParam(required = true) String name,
			@PathVariable String color, Model page) {
		page.addAttribute("username", "Yan Yan");
		page.addAttribute("color", color);
		return "home.html";
	}
}
