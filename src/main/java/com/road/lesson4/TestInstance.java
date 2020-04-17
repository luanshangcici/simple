package com.road.lesson4;

public class TestInstance {

	public static void main(String[] args) {
//		Geometric g1 = new Geometric();
		Geometric g2 = new Circle();
		Geometric g3 = new Rectangle(1, 2);
		Geometric g4 = g2;

		if (g2 instanceof Rectangle) {
			Rectangle g5 = (Rectangle) g2;
		}
		
		System.out.println("over");
//		System.out.println(g1 instanceof Geometric);
//		System.out.println(g2 instanceof Geometric);
//		System.out.println(g3 instanceof Geometric);
	}
}
