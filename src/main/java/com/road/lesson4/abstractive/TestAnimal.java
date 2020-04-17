package com.road.lesson4.abstractive;

public class TestAnimal {
	
	public static void main(String[] args) {
		Animal a1 = new Pigeon();
		
		AnimalAction action = new AnimalAction();
		action.doEat(a1);
	}

}
