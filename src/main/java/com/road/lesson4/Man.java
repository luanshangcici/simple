package com.road.lesson4;

public class Man extends Person {

	private int workAge;

	public int getWorkAge() {
		return workAge;
	}

	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}
	
	public void work(){
		System.out.println("man's work");
	}
	
	public static void main(String[] args) {
		Man man = new Man();
		man.setAge(18);
		man.setName("mike");
		System.out.println(man.getAge());
		System.out.println(man.getName());
	}

}
