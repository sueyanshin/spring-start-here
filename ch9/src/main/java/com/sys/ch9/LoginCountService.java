package com.sys.ch9;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {
	private int count;

	public void incrementCount() {
		this.count++;
	}

	public int getCount() {
		return count;
	}
}
