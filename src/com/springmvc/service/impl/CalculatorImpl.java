package com.springmvc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.springmvc.annotation.MethodDesc;
import com.springmvc.aspect.LoggingAspect;
import com.springmvc.service.CalculatorService;

@Component("calculatorService")
public class CalculatorImpl implements CalculatorService {
	private static final Logger LOG = LoggerFactory.getLogger(LoggingAspect.class);
	@MethodDesc(desc="加法(自定义注解,用于描述方法)")
	@Override
	public int add(int i, int j) {
		int result = i+j;
		LOG.info("方法add执行...");
		return result;
	}
	@Override
	public int div(int i, int j) {
		int result = i/j;
		LOG.info("方法div执行...");
		return result;
	}

	@Override
	public int sub(int i, int j) {
		int result = i-j;
		LOG.info("方法sub执行...");
		return result;
	}
}
