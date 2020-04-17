package com.road.lesson6;

public class TestInterrupt {
	
	public static void main(String[] args) {
		InterruptDemo demo = new InterruptDemo();
		Thread t1 = new Thread(demo);
		
		t1.setName("t1");
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		t1.interrupt();
	}

}

class InterruptDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			if (i == 50) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println("=============================");
				}
			}
		}
	}
	
}