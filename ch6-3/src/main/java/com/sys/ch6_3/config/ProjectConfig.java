package com.sys.ch6_3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sys.ch6_3.aspects.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "com.sys.ch6_3.services")
@EnableAspectJAutoProxy
public class ProjectConfig {
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
