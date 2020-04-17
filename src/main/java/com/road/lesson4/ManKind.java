package com.road.lesson4;

public class ManKind {
	
	int sex;
	int salary;
	
	public void manOrWorman() {
		if (sex == 1) {
			System.out.println("man");
		} else if(sex == 0) {
			System.out.println("woman");
		}
	}
	
	public void employeed() {
		if (salary > 0) {
			System.out.println("job");
		} else if (salary == 0) {
			System.out.println("no job");
		}
	}

}
