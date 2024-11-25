package com.utk.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	@Around("execution(* com.utk.service.*.*(..))")
	public void log(ProceedingJoinPoint joinPoint) {
		try {
			logger.info("Before method is executed!!!!!!!!!!!");
			joinPoint.proceed();
			logger.info("After method is executed!!!!!!!!!!!");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
