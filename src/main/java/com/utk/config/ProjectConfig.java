package com.utk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.utk.model.Parrot;
import com.utk.model.Person;

@Configuration
public class ProjectConfig {

	@Bean
	Parrot parrot() {
		Parrot parrot = new Parrot();
		parrot.setName("Koko");
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

	@Bean
	Person person(Parrot parrot) {
		Person person = new Person();
		person.setName("Person1");
		person.setParrot(parrot);// Spring injects the dependency by automatically checking for the object
									// required
		return person;
	}
}
