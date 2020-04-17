package com.road.lesson4;

public class Son extends Father {

	public Son() {
		super("mike");
		System.out.println("son's constrator");
	}

	public Son(String name) {
		this();
	}
	
	public void test(){
		System.out.println("son's test");
	}
	
//	public void test2(){
//	}
	
	public static void main(String[] args) {
		Father f1 = new Son();
		f1.test();
		
		Father f2 = new Father();
		f2.test();
	}

}
