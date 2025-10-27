package com.sys.ch9;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

	private final MainController mainController;

	private String username;
	private String password;

	private final LoginUserManagementService loginUserMangementService;

	private final LoginCountService loginCountService;

	public LoginProcessor(LoginUserManagementService loginUserManagementService, LoginCountService loginCountService,
			MainController mainController) {
		this.loginUserMangementService = loginUserManagementService;
		this.loginCountService = loginCountService;
		this.mainController = mainController;
	}

	public boolean login() {
		loginCountService.incrementCount();

		String username = this.username;
		String password = this.password;

		boolean loginResult = false;

		if (username.equals("suesue") && password.equals("password")) {
			loginResult = true;
			loginUserMangementService.setUsername(username);
		}
		return loginResult;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
