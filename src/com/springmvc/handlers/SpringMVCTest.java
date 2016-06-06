package com.springmvc.handlers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.mapper.UserMainMapper;


@Controller
public class SpringMVCTest{
	
	@Autowired
	private UserMainMapper userMainMapper;
	
	private static final String SUCCESS = "success";
	
	private static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);
	
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="User-Agent") String userAgent){
		LOG.info("User-Agent :"+userAgent);
		return SUCCESS;
	}
	@RequestMapping(value="/testRestPut/{id}",method=RequestMethod.PUT)
	public String testRestPut(@PathVariable Integer id){
		LOG.info("testRestPut :"+id);
		return SUCCESS;
	}
	@ModelAttribute
	public void getPerson(@RequestParam(value="id",required=false) Integer id,Map<String,Object> map){
		LOG.info("getPerson Method执行.....");
		if(null != id){
			List<HashMap<String,Object>> userMainList = userMainMapper.getUserRed(id);
			LOG.info("++++++++++++"+userMainList.get(0).get("nickName"));
			Person person = new Person(id, "18", "女", "160");
			LOG.info("模拟从数据库中查询得到的person"+person);
			map.put("person", person);
		}
	}
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(Person person){
		LOG.info("testModelAttribute执行修改操作。。。。"+person);
		return SUCCESS;
	}
	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("config/application-content.xml");
//		SqlSession writableSQLSession = (SqlSession) ac.getBean("writableSQLSession");
//		System.out.println(writableSQLSession.getConfiguration());
	}
}
