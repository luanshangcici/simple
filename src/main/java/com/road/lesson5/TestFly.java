package com.road.lesson5;

public class TestFly {
	
	public static void main(String[] args) {
		Plane plane = new AttackPlane();
		Bird bird = new Pigeon();
		TestFly fly = new TestFly();
		fly.testFly(plane);
		fly.testFly(bird);
		
		fly.testFly(new FlyImpl());
		fly.testFly(new Fly() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	public void testFly(Fly fly) {
//		System.out.println(1);
		fly.fly();
	}

//	public void testFly(Bird bird) {
//		System.out.println(2);
//		bird.fly();
//	}

//	public void testFly(Plane plane) {
//		System.out.println(3);
//		plane.fly();
//	}

}
