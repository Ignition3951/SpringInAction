package com.utk.main;

import java.util.function.Supplier;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utk.config.ProjectConfig;
import com.utk.model.Parrot;

public class Main {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ProjectConfig.class)) {
			Parrot parrot = new Parrot();
			parrot.setName("miki");

			Supplier<Parrot> supplierParrot = () -> parrot;

			applicationContext.registerBean("miki", Parrot.class, supplierParrot);
			Parrot registeredParrot = applicationContext.getBean(Parrot.class);
			System.out.println(registeredParrot.getName());

		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
