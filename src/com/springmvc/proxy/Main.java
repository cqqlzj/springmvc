package com.springmvc.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.aspect.VlidationAspect;
import com.springmvc.service.CalculatorService;
import com.springmvc.service.Greeting;
import com.springmvc.service.impl.GreetingImpl;
import com.springmvc.util.StringUtil;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(VlidationAspect.class);
	
	private static ApplicationContext apc;

	public static void main(String[] args) {
		apc = new ClassPathXmlApplicationContext("com/springmvc/config/application-content.xml");
		CalculatorService calculator = null;
		calculator = (CalculatorService) apc.getBean("calculatorService");
		LOG.info("result-->"+calculator.add(3, 5));
//		System.out.println("result-->"+calculator.div(9, 3));
//		Greeting greeting1 = (Greeting) apc.getBean("greeting");
//		greeting1.saySorry("javafdf");
		
		//JDKDynamicProxy
		JDKDynamicProxy jDKDynamicProxy = new JDKDynamicProxy(new GreetingImpl());
		Greeting greeting  =  (Greeting) jDKDynamicProxy.getProxy();
		greeting.saySorry("cqq");
		//CJLIBDynamicProxy
		CJLIBDynamicProxy cJLIBDynamicProxy = new CJLIBDynamicProxy();
		StringUtil stringUtil = (StringUtil) cJLIBDynamicProxy.getProxy(new StringUtil());
		stringUtil.testUtil("我", "测试");
	}

}
