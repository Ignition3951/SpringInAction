package com.utk.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void init() {
		this.name = "Stereotype Parrot";
	}

}
