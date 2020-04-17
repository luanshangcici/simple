package com.road.lesson4;

public class Rectangle extends Geometric{

	private double length;
	private double hight;

	public Rectangle(double length, double hight) {
		super();
		this.length = length;
		this.hight = hight;
	}

	public double findArea() {
		return length * hight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

}
