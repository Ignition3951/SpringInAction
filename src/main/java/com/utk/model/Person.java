package com.utk.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name = "Person1";

	private final Parrot parrot;

	@Autowired
	public Person(@Qualifier("componentBean") Parrot parrot2) {
		this.parrot = parrot2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Parrot getParrot() {
		return parrot;
	}

	/*
	 * public void setParrot(Parrot parrot) { this.parrot = parrot; } // Now the
	 * value of parrot cannot be changed as it is declared as final this is the
	 * benefit of using constructor autowiring
	 */

	@Override
	public String toString() {
		return "Person [name=" + name + ", parrot=" + parrot + "]";
	}

}
