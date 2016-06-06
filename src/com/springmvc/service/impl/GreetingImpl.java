package com.springmvc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.springmvc.aspect.LoggingAspect;
import com.springmvc.service.Greeting;

@Component("greeting")
public class GreetingImpl implements Greeting {

	private static final Logger LOG = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Override
	public void saySorry(String somebody) {
		LOG.info("saySorry() to "+somebody);
	}

}
