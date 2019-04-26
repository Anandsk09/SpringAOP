package com.spring.aop.model.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdviceAround {
	
	/*
	 * @Around(value="execution(* get*())") public Object
	 * getAdvice(ProceedingJoinPoint point)
	 * 
	 * { Object returnvalue=null;
	 * 
	 * try { System.out.println("Befor Actual Execution..");
	 * returnvalue=point.proceed(); System.out.println("After Actual Execution..");
	 * } catch (Throwable e) { // TODO Auto-generated catch block
	 * System.out.println("After Actual Execution.."); e.printStackTrace(); } return
	 * returnvalue;
	 * 
	 * 
	 * //System.out.println("Around advice... "+name); }
	 */
	
	@Around("@annotation(com.spring.aop.model.Aspects.Loggable)")
	public Object getCustomAnnotationAdvice(ProceedingJoinPoint point) 
	
	{
		Object returnvalue=null;
		
		try {
			System.out.println("Befor Actual Execution..");
			returnvalue=point.proceed();
			System.out.println("After Actual Execution..");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("After Actual Execution..");
			e.printStackTrace();
		}
		return returnvalue;
		
		
		//System.out.println("Around advice... "+name);
	}

}
