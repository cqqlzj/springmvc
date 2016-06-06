package com.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.model.Person;
import com.springmvc.service.impl.CalculatorImpl;

public class Test {

	public static void main(String[] args) {
		try {
//			HelloWorldInterface rhello = new HelloWorldImpl();
//			Registry registry = LocateRegistry.createRegistry(8888);
//			registry.bind("hello", rhello);
//			System.out.println("Remote Hello Object is bound sucessfully");
			
			CalculatorService calculatorService = new CalculatorImpl();
			System.out.println(calculatorService.add(5, 4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
