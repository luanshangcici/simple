package com.road.lesson7.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestParam {

	int a;
	int b;
	int c;
	
	public TestParam(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(c, add(a, b));
	}
	
	public int add(int a, int b){
		return a + b;
	}

	 @Parameters
	 public static Collection data() {
		 return Arrays.asList(new Object[][]{
			 {1, 2, 3},
			 {11, 12, 23},
			 {21, 22, 43},
			 {31, 32, 63},
		 });
	 }

}
