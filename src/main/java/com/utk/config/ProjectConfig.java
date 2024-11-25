package com.utk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.utk.aspect.LoggingAspect;
import com.utk.aspect.SecurityAspect;
import com.utk.model.Parrot;

@Configuration
@ComponentScan(basePackages = { "com.utk.model", "com.utk.service", "com.utk.repositories", "com.utk.proxies",
		"com.utk.aspect" })
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean("parrotNaming")
	public Parrot parrot1() {
		Parrot parrot = new Parrot();
		parrot.setName("parrotNaming");
		return parrot;
	}

	@Bean
	public Parrot parrot2() {
		Parrot parrot = new Parrot();
		parrot.setName("parrot2");
		return parrot;
	}

	@Bean
	public LoggingAspect aspect() {
		return new LoggingAspect();
	}

	@Bean
	public SecurityAspect secure() {
		return new SecurityAspect();
	}
}
