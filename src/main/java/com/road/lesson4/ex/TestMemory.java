package com.road.lesson4.ex;

import java.util.ArrayList;

import com.road.lesson4.Person;

public class TestMemory {
	
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 50000; i++) {
			list.add(new Person());
		}
		
		try {
			Thread.sleep(10000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
