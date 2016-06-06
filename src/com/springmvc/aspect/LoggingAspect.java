package com.springmvc.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.springmvc.annotation.MethodDesc;

@Order(2)
@Aspect
@Component
public class LoggingAspect {
	private static final Logger LOG = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Pointcut("execution(* com.springmvc.service.*.*(..))")
	public void declareJoinPointExpression(){}

	@Before("declareJoinPointExpression()")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();//方法名
		Object [] args = joinPoint.getArgs();//参数
		LOG.info("The method " + methodName + " begins with " + Arrays.asList(args));
	}
	/**
	 * 方法执行后执行,无论是否有异常,访问不到返回值
	 * @param joinPoint
	 */
//	@After("within(com.springmvc.service..*)  && @annotation(desc)")
	@After("declareJoinPointExpression()  && @annotation(desc)")
	public void afterMethod(JoinPoint joinPoint,MethodDesc desc){
		String methodName = joinPoint.getSignature().getName();//方法名
		LOG.info("The method " + methodName + " ends "+"desc:"+desc.desc());
	}
	/**
	 * 方法正常执行后执行,可以访问到返回值
	 * @param joinPoint
	 * @param result
	 */
	@AfterReturning(value="declareJoinPointExpression()",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		String methodName = joinPoint.getSignature().getName();
		LOG.info("The method " + methodName + " end with " + result);
	}
	/**
	 * 执行方法出异常时执行
	 * @param joinPoint
	 * @param ex
	 */
	@AfterThrowing(value="declareJoinPointExpression()",throwing="ex")
	public void afterThrowing(JoinPoint joinPoint,Exception ex){
		String methodName = joinPoint.getSignature().getName();
		LOG.info("The method " + methodName + " occurs Exception " + ex);
	}
	@Around(value="declareJoinPointExpression()")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		String methodName = pjp.getSignature().getName();
		LOG.info("The method " + methodName + " around before ");
		Object obj = pjp.proceed();
		LOG.info("The method " + methodName + " around after with result ");
		return obj;
	}
}
