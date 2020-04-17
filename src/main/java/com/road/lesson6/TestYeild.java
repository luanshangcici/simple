package com.road.lesson6;

public class TestYeild {
	
	public static void main(String[] args) {
		YeildDemo yd = new YeildDemo();
		Thread t1 = new Thread(yd);
		Thread t2 = new Thread(yd);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

}

class YeildDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 101; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			if (i % 10 == 0) {
				Thread.yield();
			}
		}
	}
	
}