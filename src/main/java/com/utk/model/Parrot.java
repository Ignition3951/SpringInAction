package com.utk.model;

public class Parrot {

	String name;

	public Parrot() {
		System.out.println("Parrot got generated!!!!!!!!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parrot [name=" + name + "]";
	}

}
