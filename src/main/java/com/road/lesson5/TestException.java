package com.road.lesson5;

import com.road.lesson4.Person;

public class TestException {
	
	public static void main(String[] args) {
//		Person p = null;
//		p.getAge();
		
//		int a[] = {1,2};
//		System.out.println(a[2]);
//		System.out.println(new TestException().test1());
//		new TestException().test2();
		
//		TestException t1 = new TestException();
//		TestException t2 = new SubClass();
//		try {
//			t1.test3();
//			t2.test3();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		TestException t1 = new TestException();
		t1.test4(0);
		
	}
	
	public void test4(int i){
		if (i == 0) {
			throw new MyException("输入参数不能为0");
		}
	}
	
	public void test2() throws ClassNotFoundException{
//		try {
			test3();
//		} catch (Exception e) {
//			System.out.println("test2");
//		}
	}
	
	public int test1(){
		try {
			int i = 1 / 0;
		} catch (NullPointerException e) {
			return 1;
		} catch (ArithmeticException e){
			return 2;
		} catch (Exception e) {
			return 3;
		} finally {
			System.out.println("finally");
		}
		return 0;
	}

	public void test3() throws ClassNotFoundException {
//		try {
			Class.forName("");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}

class SubClass extends TestException{

	public void test3() throws ClassNotFoundException {
//		try {
			Class.forName("");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}