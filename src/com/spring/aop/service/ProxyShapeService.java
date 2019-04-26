package com.spring.aop.service;

import com.spring.aop.model.Circle;
import com.spring.aop.model.Aspects.ProxyLoggingAdvice;

public class ProxyShapeService extends ShapeService{

	@Override
	public Circle getCircle() {
		// TODO Auto-generated method stub
		new ProxyLoggingAdvice().runAdvice();
		return super.getCircle();
	}
	
	

}
