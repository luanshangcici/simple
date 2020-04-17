package com.road.lesson4;

public class Father extends Grandpa{
	
	public Father(){
		System.out.println("father's constrator");
	}

	public Father(String name){
		System.out.println("father's constrator2");
	}

	public Father(String name, int age){
		System.out.println("father's constrator3");
	}
	
	public void test(){
		System.out.println("father's test");
	}
	
	public final void test2(){
		
	}

}
