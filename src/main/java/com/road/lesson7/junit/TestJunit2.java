package com.road.lesson7.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunit2 {
	
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
//		Assert.assertEquals(2, add(1, 1));
//		Assert.assertEquals(3, add(1, 2));
//		Assert.assertEquals("case3", 3, add(2, 2));
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
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
