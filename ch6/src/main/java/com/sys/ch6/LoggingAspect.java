package com.sys.ch6;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

//	@Around("execution(* com.sys.services.*.*(..))")
//	public void log(ProceedingJoinPoint joinPoint) throws Throwable {
//		logger.info("Method will execute.");
//		joinPoint.proceed(); // call the intercepted method
//		logger.info("Method is executed.");
//	}

	// Accessing the parameters, returned value of the target aspect
//	@Around("execution(* com.sys.services.*.*(..))")
//	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//		String methodName = joinPoint.getSignature().getName();
//		Object[] arguments = joinPoint.getArgs();
//
//		logger.info("Method:" + methodName + " with parameters " + Arrays.asList(arguments) + " will execute");
//
//		Object returnedByMethod = joinPoint.proceed();
//
//		logger.info("Method executed and returned " + returnedByMethod);
//
//		return returnedByMethod;
//	}

	// Altering the parameters and returned value
	@Around("execution(* com.sys.services.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();

		logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute");

		Comment comment = new Comment();
		comment.setText("Some other text");
		Object[] newArugments = { comment };

		Object returnedByMethod = joinPoint.proceed(newArugments);

		logger.info("Methods executed and returned " + returnedByMethod);

		return "Failed";
	}
}
