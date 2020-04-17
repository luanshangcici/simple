package com.road.lesson2;

public class TestDoWhile {
	
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while (i <= 100);
		
		System.out.println(sum);
		
		//--------------------------------
		sum += i;
		i++;
		
		while (i <= 100){
			sum += i;
			i++;
		}
		
		System.out.println(sum);
	}

}
