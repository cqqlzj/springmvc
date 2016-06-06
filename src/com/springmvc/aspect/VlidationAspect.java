package com.springmvc.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Aspect
@Component
public class VlidationAspect {
	private static final Logger LOG = LoggerFactory.getLogger(VlidationAspect.class);

	@Before("execution(* com.springmvc.service.CalculatorService.*(..))")
	public void validateArgs(JoinPoint joinPoint){
		LOG.info("The method " +joinPoint.getSignature().getName()+" validate 参数: "+ Arrays.asList(joinPoint.getArgs()));
	}
}
