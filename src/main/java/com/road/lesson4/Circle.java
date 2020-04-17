package com.road.lesson4;

public class Circle extends Geometric {

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

