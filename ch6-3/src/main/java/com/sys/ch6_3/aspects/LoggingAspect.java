package com.sys.ch6_3.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	@AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
	public void log(Object returnedValue) throws Throwable {
		logger.info("Method executed and returned: " + returnedValue);

	}
}
