package com.road.lesson2;

public class TestBreak {

	public static void main(String[] args) {
		int i = 0;
		
		while (i < 50) {
			i++;
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
