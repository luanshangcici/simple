package com.road.lesson5;

public class Pigeon extends Bird {

	@Override
	public void fly() {
		System.out.println("pigeon's fly");
	}

	@Override
	public void addEnergy() {
		System.out.println("pegeion's eat");
	}
}
