package com.road.lesson4;

public class Cylinder extends Circle{
	
	private double length;

	public Cylinder(){
		length = 1;
	}

	public Cylinder(double length){
		this.length = length;
	}

	public Cylinder(double radius, double length){
		super(radius);
		this.length = length;
	}

	public double findArea () {
		return super.findArea() * 2 + super.findZhouchang() * length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
		return super.findArea() * length;
	}

}
