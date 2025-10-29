package com.sys.ch6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.sys.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
