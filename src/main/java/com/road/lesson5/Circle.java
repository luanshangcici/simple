package com.road.lesson5;

public class Circle {

	private double radius;
	
	public Circle (){
		this.radius = 1;
	}
	
	public Circle (double radius){
		this.radius = radius;
	}
	
	public double findZhouchang(){
		return 2 * Math.PI * radius;
	}

	public double findArea () {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}

