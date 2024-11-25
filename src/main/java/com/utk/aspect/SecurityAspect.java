package com.utk.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class SecurityAspect {

	private static Logger logger = Logger.getLogger(SecurityAspect.class.getName());

	@Around("@annotation(ToLog)")
	public void secure(ProceedingJoinPoint joinpoint) {
		try {
			logger.info("Security Aspect executed before method : ");
			joinpoint.proceed();
			logger.info("Security Aspect executed after method : ");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
