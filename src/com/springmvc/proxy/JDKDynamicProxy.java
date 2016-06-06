package com.springmvc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JDK动态代理
 * @author Administrator
 *
 */
public class JDKDynamicProxy{
	private static final Logger LOG = LoggerFactory.getLogger(JDKDynamicProxy.class);
	//要代理的对象
	private Object target;
	
	public JDKDynamicProxy(Object target){
		super();
		this.target = target;
	}
	
	public Object getProxy(){
		Object proxy = null;
		ClassLoader loader = target.getClass().getClassLoader();
		Class[] interfaces = target.getClass().getInterfaces();
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				//打印方法前日志
				LOG.info("JDKProxy--> the method "+method.getName()+" begin with "+Arrays.toString(args));
				//调用目标方法
				Object result = null;
				try {
					//前置通知
					result = method.invoke(target, args);
					//返回通知, 可以访问到方法的返回值
				} catch (NullPointerException e) {
					e.printStackTrace();
					//异常通知, 可以访问到方法出现的异常
				}
				//打印方法后日志
				LOG.info("JDKProxy--> the method "+method.getName()+" end with "+result);
				return result;
			}
		};
		/**
		 * loader: 代理对象使用的类加载器。 
		 * interfaces: 指定代理对象的类型. 即代理代理对象中可以有哪些方法. 
		 * h: 当具体调用代理对象的方法时, 应该如何进行响应, 实际上就是调用 InvocationHandler 的 invoke 方法
		 */
		proxy = (Object) Proxy.newProxyInstance(loader, interfaces, handler);
		return proxy;
	}
}
