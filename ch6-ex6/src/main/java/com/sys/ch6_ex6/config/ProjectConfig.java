package com.sys.ch6_ex6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sys.ch6_ex6.aspects.LoggingAspect;
import com.sys.ch6_ex6.aspects.SecurityAspect;

@Configuration
@ComponentScan(basePackages = "com.sys.ch6_ex6.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}

	@Bean
	public SecurityAspect securityAspect() {
		return new SecurityAspect();
	}
}
