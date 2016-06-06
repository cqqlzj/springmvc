package com.springmvc.service;

public interface CalculatorService {
	
	public int add(int i,int j);
	
	public int sub(int i,int j);
	
	public int div(int i,int j);
	
	public default String test(String aa){
		return aa;
	}

}
