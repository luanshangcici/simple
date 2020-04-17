package com.road.lesson5;

public class AttackPlane extends Plane{

	@Override
	public void fly() {
		System.out.println("AttackPlane's fly");
	}
	
	public void attack() {
		System.out.println("attack");
	}

	@Override
	public void addEnergy() {
		System.out.println("add flue");
	}

}
