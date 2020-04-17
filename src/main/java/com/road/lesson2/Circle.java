package com.road.lesson2;

public class Circle {

	public double radius;

	public static double getArea (double r) {
		return Math.PI * r * r;
	}

	public double getArea () {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 2;
		System.out.println(c.getArea());
		System.out.println(Circle.getArea(2));
	}
}

