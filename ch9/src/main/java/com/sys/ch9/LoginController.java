package com.sys.ch9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private final LoginProcessor loginProcessor;

	public LoginController(LoginProcessor loginProcessor) {
		this.loginProcessor = loginProcessor;
	}

	@GetMapping("/login")
	public String loginGet() {
		return "login.html";
	}

	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, Model model) {

		boolean loggedIn = loginProcessor.login(username, password);
		if (loggedIn) {
			model.addAttribute("message", "login succeed");

		} else {
			model.addAttribute("message", "login failed");
		}
		return "login.html";
	}
}
