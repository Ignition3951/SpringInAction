package com.utk.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utk.config.ProjectConfig;
import com.utk.model.Parrot;

public class Main {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ProjectConfig.class)) {
			Parrot parrot1 = (Parrot) applicationContext.getBean(Parrot.class);
			System.out.println(parrot1);
			System.out.println(parrot1.getName());
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
