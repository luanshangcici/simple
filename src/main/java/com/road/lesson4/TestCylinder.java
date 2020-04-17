package com.road.lesson4;

public class TestCylinder {
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		System.out.println(c.findVolume());
		c.setRadius(2);
		c.setLength(2);
		System.out.println(c.findVolume());
		
		System.out.println(c.findArea());
	}

}
