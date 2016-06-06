package com.springmvc.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.springframework.stereotype.Component;

import com.springmvc.service.HelloWorldInterface;
/**
 * @author Administrator
 *
 */
@Component
public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorldInterface{

	private static final long serialVersionUID = -7273608855250629602L;
	private int index = 0;
	
	protected HelloWorldImpl() throws RemoteException {
		super();
	}
	
	@Override
	public int sayHello() {
		System.out.println("服务端Hello!!");
		return index++;
	}

	@Override
//	@Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次
	public void testQuartz() {
		System.out.println("定时器执行了"+Thread.currentThread().getName());
	}

}
