package com.spring.aop.practice;

import com.spring.aop.service.FactoryService;
import com.spring.aop.service.ShapeService;

public class AOPProxyMain {

	public static void main(String[] args) {
		FactoryService service=new FactoryService();
		ShapeService shapeService=(ShapeService) service.getBeans("shapeService");
		shapeService.getCircle();

	}

}
