package com.road.lesson6;

public class TestSleep {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
