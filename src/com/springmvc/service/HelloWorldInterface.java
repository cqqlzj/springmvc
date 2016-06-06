package com.springmvc.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorldInterface extends Remote{
	
	public int sayHello() throws RemoteException;
	
	public void testQuartz() throws RemoteException;

}
