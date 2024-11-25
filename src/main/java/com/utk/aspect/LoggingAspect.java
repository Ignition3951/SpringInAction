package com.utk.aspect;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.utk.model.Comment;

@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	@Around("execution(* com.utk.service.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) {
		try {
			String methodName = joinPoint.getSignature().getName();
			Object[] methodArguments = joinPoint.getArgs();
			logger.info("Method will execute having name : " + methodName + " and arguments : "
					+ Arrays.asList(methodArguments));
			Comment aspectComment = new Comment();
			aspectComment.setAuthor("Aspect");
			aspectComment.setText("Comment by aspect");
			Object[] newArguments = { aspectComment };
			Object returnedValue = joinPoint.proceed(newArguments);
			logger.info("Method executed and returned : " + returnedValue);
			return returnedValue + " updated by Aspect";
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

}
