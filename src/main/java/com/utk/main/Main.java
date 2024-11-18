package com.utk.main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utk.config.ProjectConfig;

public class Main {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ProjectConfig.class)) {
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
