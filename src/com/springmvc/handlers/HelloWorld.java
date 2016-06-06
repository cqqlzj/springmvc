package com.springmvc.handlers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld{
	private static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);
	
	@RequestMapping("/helloworld")
	public String hello(HttpServletRequest request,Person person){
		LOG.info("进入了hello...");
		LOG.info("项目实际路径："+request.getSession().getServletContext().getRealPath("")); 
		LOG.info("age :"+person.getAge()+"| sex :"+person.getSex()+"| higth :"+person.getHigth());
		return "success";
	}
}
