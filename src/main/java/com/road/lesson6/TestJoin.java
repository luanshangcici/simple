package com.road.lesson6;

public class TestJoin {
	
	public static void main(String[] args) {
		JoinDemo jd = new JoinDemo();
		Thread t1 = new Thread(jd);
		t1.setName("t1");
		t1.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			if (i == 50) {
				try {
					t1.join();
				} catch (InterruptedException e) {
				}
			}
		}
	}

}

class JoinDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			
		}
	}
	
}