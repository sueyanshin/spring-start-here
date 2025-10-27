package com.sys.ch9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	private final LoginUserManagementService loginUserManagementService;

	private final LoginCountService loginCountService;

	public MainController(LoginUserManagementService loginUserManagementService, LoginCountService loginCountService,
			LoginController loginController) {
		this.loginUserManagementService = loginUserManagementService;
		this.loginCountService = loginCountService;
	}

	@GetMapping("/main")
	public String main(@RequestParam(required = false) String logout, Model model) {
		if (logout != null) {
			loginUserManagementService.setUsername(null);
		}
		String username = loginUserManagementService.getUsername();
		if (username == null) {
			return "redirect:/login";
		}
		int loginCount = loginCountService.getCount();
		model.addAttribute("username", username);
		model.addAttribute("loginCount", loginCount);

		return "main.html";
	}
}
