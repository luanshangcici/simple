package com.road.lesson1;

public class TestIf {
	
	public static void main(String[] args) {
		int i = 0;

		if (i > 1) {
			i++;
			i++;
		}
		
		if (i > 1) {
			System.out.println(true);
		} else {
			System.out.println("else");
		}
		
		i = 2;
		int j = 3;
		int k = 4;
		if (i > 3 || j > 2) {
			System.out.println(2);
		} else if (k > 1) {
			System.out.println(1);
		} else {
			System.out.println(4);
		}

	}

}
