package com.utk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.utk.model.Parrot;

@Configuration
public class ProjectConfig {

	@Bean
	Parrot parrot1() {
		Parrot parrot = new Parrot();
		parrot.setName("PArrot 1");
		return parrot;
	}

	@Bean
	Parrot parrot2() {
		Parrot parrot = new Parrot();
		parrot.setName("PArrot 2");
		return parrot;
	}

	@Bean
	@Primary
	Parrot parrot3() {
		Parrot parrot = new Parrot();
		parrot.setName("PArrot Primary");
		return parrot;
	}

	@Bean
	String value() {
		return "Value returned!!!";
	}

	@Bean
	Integer number() {
		return 13;
	}

}
