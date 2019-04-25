package com.spring.aop.model.Aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.spring.aop.model.Circle;

@Aspect
@Component
public class LoggingAspect {
	@Before("allgetters() && allgetters2()")
	//Use of JointPoints
	public void loggingAdvice(JoinPoint jointPoint)
	{
		Circle circle=(Circle)jointPoint.getTarget();
		//System.out.println("Jpoint "+circle.getName());
		//System.out.println("Advice Run....Inside Logging Aspect.... ");
	}
	
	//Use of PointCuts

	  @Before("allgetters()") public void secondAdvice() {
	  System.out.println("Before Advice Run....Inside 2nd Advice Aspect.... "); }
	  
	  //args
	  @Before("args((name))")
	  public void thirdAdvice(String name) {
	 System.out.println("Before Advice Run....Inside 3rd Advice Aspect.... "+name); }
	 
	//use of execution
	@Pointcut(value="execution(* get*())")
	public void allgetters() {}
	
	//Use of within
	
	@Pointcut("within(com.spring.aop.model.Circle)")
	public void allgetters2() {}
	
	

}
