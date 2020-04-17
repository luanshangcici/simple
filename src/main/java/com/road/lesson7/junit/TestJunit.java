package com.road.lesson7.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJunit {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	@Ignore
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(timeout=1000)
	public void test3() {
		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
		}
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void test4() {
		int i = 1 / 0;
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	
	public int add(int a, int b){
		return a + b;
	}

}
