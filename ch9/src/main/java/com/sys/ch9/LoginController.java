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

		loginProcessor.setUsername(username);
		loginProcessor.setPassword(password);

		boolean loggedIn = loginProcessor.login();
		if (loggedIn) {
            model.addAttribute("message", "You are now logged in.");
//            return "redirect:/main";

		}
		model.addAttribute("message", "Login failed!");
		return "login.html";
	}

}
