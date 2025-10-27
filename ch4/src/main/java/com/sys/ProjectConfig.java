package com.sys;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.sys.proxies", "com.sys.services", "com.sys.repositories" })
public class ProjectConfig {

}
