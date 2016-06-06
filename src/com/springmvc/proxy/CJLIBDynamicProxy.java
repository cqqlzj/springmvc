package com.springmvc.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CJLIB动态代理
 * @author Administrator
 *
 */
public class CJLIBDynamicProxy implements MethodInterceptor{
	private static final Logger LOG = LoggerFactory.getLogger(CJLIBDynamicProxy.class);
	//要代理的对象
	private Object target;
	
	public Object getProxy(Object target){
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		//回调方法
		enhancer.setCallback(this);
		//创建代理对象
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method arg1, Object[] arg2,
			MethodProxy proxy) throws Throwable {
		LOG.info("事务开始");
		proxy.invokeSuper(obj, arg2);
		LOG.info("事务结束");
		return null;
	}
}
