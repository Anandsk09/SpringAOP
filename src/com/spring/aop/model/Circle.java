package com.spring.aop.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//throw new RuntimeException();
	}
	
	public String setNameReturn(String name)
	{
			return "returning the same value...."+name;
	}

}
