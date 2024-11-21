package com.utk.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utk.config.ProjectConfig;
import com.utk.model.Person;

public class Main {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ProjectConfig.class)) {
			Person person = applicationContext.getBean(Person.class);

			System.out.println("Persons name : " + person.getName());
			System.out.println("Persons parrot name : " + person.getParrot());
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
