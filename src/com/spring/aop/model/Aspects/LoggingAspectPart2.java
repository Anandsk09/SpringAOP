package com.spring.aop.model.Aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectPart2 {
	
	
	 @AfterReturning("args(name)")
	  public void thirdAdvice(String name) {
	 System.out.println("After Advice returning... "+name); }
	 
	
	 @AfterThrowing("args(name)")
		public void allgettersthrow(String name) {
		 
		 System.out.println("After allgetters in throwing...........");
	 }
	/*
	 * @After("args((name))") public void allgetters(String name) {
	 * 
	 * System.out.println("After advice.........."); }
	 */
	 
}
