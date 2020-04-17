package com.road.lesson6;

public class TestIsAlive {
	
	public static void main(String[] args) {
		IsAliveDemo demo = new IsAliveDemo();
		
		Thread t1 = new Thread(demo);
		System.out.println("after new: " + t1.isAlive());
		
		t1.start();
		System.out.println("after start: " + t1.isAlive());
		
		try {
			t1.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("after t1 over: " + t1.isAlive());
		
//		t1.start();
//		System.out.println("after t1 restart: " + t1.isAlive());
	}

}

class IsAliveDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
}