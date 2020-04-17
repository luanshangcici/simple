package com.road.lesson4;

public class Kids1 extends ManKind{
	
	 int yearsOld;
	 
	 public void printAge() {
		 System.out.println(yearsOld);
	 }
	 
	 public static void main(String[] args) {
		Kids1 kid = new Kids1();
		kid.salary = 1;
		kid.sex = 1;
		kid.yearsOld = 12;
		kid.employeed();
		kid.manOrWorman();
	}

}
