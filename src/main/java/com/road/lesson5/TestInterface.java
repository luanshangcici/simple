package com.road.lesson5;

public class TestInterface {
	
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle();
		c1.setRadius(1);
		ComparableCircle c2 = new ComparableCircle();
		c2.setRadius(2);
		
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c1));
	}

}
