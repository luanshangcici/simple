package com.road.lesson4.abstractive;

public abstract class Bird extends Animal{

	@Override
	public void move() {
		fly();
	}
	
	public void fly(){
		System.out.println("bird's fly");
	}

}
