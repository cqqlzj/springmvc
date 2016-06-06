package com.springmvc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtil {
	private static final Logger LOG = LoggerFactory.getLogger(StringUtil.class);
	
	public String testUtil(String a,String b){
		LOG.info("the method testUtil executeing ");
		return a+"@@"+b;
	}

}
