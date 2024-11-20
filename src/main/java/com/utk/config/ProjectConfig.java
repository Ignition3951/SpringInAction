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
		parrot.setName("Miki");
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
	Person person() {
		Person person = new Person();
		person.setName("Person1");
		person.setParrot(parrot());// The parrot object will be generated only once and that instance will be
									// referenced from person context of spring checks for an instance if it finds
									// one then that object is alloted to the referenced variable.
		return person;
	}
}
