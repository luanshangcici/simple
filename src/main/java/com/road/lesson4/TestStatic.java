package com.road.lesson4;

public class TestStatic {
	
	public static int A = 0;
	public int a;
	public static final int i = 1;

	public TestStatic(){
		System.out.println("teststatic's constrator");
//		i = 2;
	}
	
	public static void test(){
//		a = 1;
		System.out.println("test");
	}

	public void test2(){
		a = 1;
		System.out.println("test2");
	}
	
	public static void main(String[] args) {
		TestStatic ts1 = new TestStatic();
		TestStatic ts2 = new TestStatic();
		ts1.A = 1;
		System.out.println(ts1.A);
		System.out.println(ts2.A);
		ts2.A = 111;
		System.out.println(ts1.A);
	}

}
