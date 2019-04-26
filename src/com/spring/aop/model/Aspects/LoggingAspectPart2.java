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
	
	
	 @AfterReturning(pointcut="args(name)",returning="returningString")
	  public void thirdAdvice(String name,String returningString) {
	 System.out.println("After Advice returning... "+name+"\t return value..."+returningString); }
	 
	
	 @AfterThrowing(pointcut="args(name)",throwing="exception")
		public void allgettersthrow(String name,Exception exception) {
		 
		 System.out.println("After allgetters in throwing..........."+exception);
	 }
	
	  @After("args((name))") public void allgetters(String name) {
	  
	  System.out.println("After advice.........."); }
	 
	 
}
