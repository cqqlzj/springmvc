package com.springmvc.handlers;

public class Person {
	
	private Integer id;

	private String age = "";
	
	private String sex = "";
	
	private String higth = "";
	

	public Person() {
		super();
	}

	public Person(Integer id, String age, String sex, String higth) {
		super();
		this.id = id;
		this.age = age;
		this.sex = sex;
		this.higth = higth;
	}

	
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", sex=" + sex
				+ ", higth=" + higth + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHigth() {
		return higth;
	}

	public void setHigth(String higth) {
		this.higth = higth;
	}
}
