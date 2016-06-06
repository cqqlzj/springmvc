package com.springmvc.mapper;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.springmvc.model.UserMain;

public class MybatisTest {

	public static void main(String[] args) {
		//mybatis配置文件
		String resource = "com/springmvc/config/mybatis-config.xml";
		//使用类加载器加载mybatis配置文件
		InputStream is = MybatisTest.class.getClassLoader().getResourceAsStream(resource);
		//构建sqlSession的工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		//创建能执行映射文件中sql的sqlSession
		SqlSession session = sessionFactory.openSession();
		
		String statement = "com.springmvc.mapper.userMainMapper.getUser";
		UserMain user = session.selectOne(statement,6090193);
		session.close();
		System.out.println(user);
	}

}
