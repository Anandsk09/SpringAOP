package com.spring.aop.service;

import com.spring.aop.model.Circle;
import com.spring.aop.model.Triangle;

public class FactoryService {
	
	public Object getBeans(String name)
	{
		if(name.equalsIgnoreCase("shapeService"))
			return new ProxyShapeService();
		
		if(name.equalsIgnoreCase("circle"))
			return new Circle();
		
		if(name.equalsIgnoreCase("Triangle"))
			return new Triangle();
		
		return null;
	}

}
