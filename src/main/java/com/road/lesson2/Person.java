package com.road.lesson2;

public class Person {
	
	public String name;
	public int age;
	public int sex;
	
	public void study() {
		System.out.println("studying");
	}
	
	public void showAge() {
		System.out.println(age);
	}
	
	public void addAge(int i) {
		this.age += i;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = p1;
		
		p1.age = 10;
		p1.name = "张三";
		p1.sex = 1;
		p1.study();
		p1.showAge();
		p1.addAge(10);
		System.out.println("============");
		
		p2.age = 18;
		p2.name = "李四";
		p2.sex = 2;
		p2.showAge();
		p2.addAge(10);
		System.out.println("============");
		
		p3.age = 30;
		System.out.println(p3.age);
		System.out.println(p1.age);
		
	}

}
