package com.road.lesson2;

public class TestClass {
	
	public static void main(String[] args) {
		TestClassDemo tc1 = new TestClassDemo();//0x123a	2
		TestClassDemo tc2 = new TestClassDemo();//0x123b	1
		TestClassDemo tc3 = tc1;
		
		tc1.tcd = tc2;
		tc2.tcd = tc1;

//		tc1 = null;
//		tc2 = null;
		
		System.out.println(tc1.i);
		tc1.i = 3;
		tc1.test(2);
		
		new TestClassDemo().test2();
		
//		TestClassDemo tc4 = new TestClassDemo();
		tc1.test3(new TestClassDemo());
	}

}

class TestClassDemo {

	public int i = 100;
	public TestClassDemo tcd;

	public void test(int i) {
		this.i = i;
		System.out.println("123");
	}
	
	public void test2() {
		test(3);
		System.out.println(i);
	}
	
	public void test3(TestClassDemo tcd) {
		this.tcd = tcd;
	}
	
}
