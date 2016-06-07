package com.springmvc.util;

import java.util.HashMap;

import com.springmvc.model.Person;

public class Test {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("a", new Person("qq", 12));
		map.put("a", new Person());
		map.put("a", new Person("dd", 11));
		map.put("a", new Person("mastertest", 11));//添加下备注
		System.out.println(map.get("a"));
	}

}
