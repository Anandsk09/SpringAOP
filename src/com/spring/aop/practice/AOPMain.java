package com.spring.aop.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);
		//System.out.println(shapeService.getCircle().getName());
		shapeService.getCircle().setName("circle");
		shapeService.getCircle().setNameReturn("Returning Circle");
	}

}
