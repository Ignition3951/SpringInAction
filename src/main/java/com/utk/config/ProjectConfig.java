package com.utk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.utk.model.Parrot;

@Configuration
@ComponentScan(basePackages = { "com.utk.model" })
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
}
