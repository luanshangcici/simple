package com.road.lesson3;

public class TestReload {
	
	public Person getPerson(){
		return Person.instance();
	}
	
	public Person getPerson(String name){
		return Person.instance();
	}

	public Person getPerson(int age, String name){
		return Person.instance();
	}

	public Person getPerson(String name, int age){
		return Person.instance();
	}

	public int getPerson(double name){
		return 1;
	}

}
