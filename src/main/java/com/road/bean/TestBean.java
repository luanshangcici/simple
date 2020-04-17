package com.road.bean;

public class TestBean {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(3000);
	}

}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 200) {
			age = 200;
		} else if(age < 0) {
			age = 0;
		} else {
			this.age = age;
		}
	}

}