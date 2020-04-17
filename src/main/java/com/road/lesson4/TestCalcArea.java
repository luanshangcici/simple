package com.road.lesson4;

public class TestCalcArea {

	public static void main(String[] args) {
		Geometric g1 = new Circle(1);
		Geometric g2 = new Cylinder(1, 2);
		Geometric g3 = new Rectangle(1, 2);
//		Geometric g4 = new Geometric();

		CalcArea calc = new CalcArea();
		System.out.println(calc.calc(g1));
		System.out.println(calc.calc(g2));
		System.out.println(calc.calc(g3));
		
	}
}
