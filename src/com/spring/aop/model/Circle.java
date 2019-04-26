package com.spring.aop.model;

import com.spring.aop.model.Aspects.Loggable;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//To Test Afterthrowing uncomment
		//throw new RuntimeException();
	}
	
	//To Test AfterReturning uncomment
	/*
	 * public String setNameReturn(String name) { return
	 * "returning the same value...."+name; }
	 */
}
