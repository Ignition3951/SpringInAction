package com.utk.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utk.config.ProjectConfig;
import com.utk.model.Parrot;

public class Main {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ProjectConfig.class)) {
			Parrot parrot1 = (Parrot) applicationContext.getBean("parrot1");// This has been done to remove the
																			// ambiguity
																			// exception that we get as we have defined
																			// three parrots in the Config class
			parrot1.setName("Miki");
			System.out.println(parrot1.getName());

			String value = applicationContext.getBean(String.class);// As there is only one bean of this type hence name
																	// is not required
			System.out.println(value);

			Integer number = applicationContext.getBean(Integer.class);
			System.out.println(number);
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
