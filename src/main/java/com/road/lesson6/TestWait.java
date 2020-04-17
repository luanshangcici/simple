package com.road.lesson6;

public class TestWait {

	public static void main(String[] args) {
		WaitDemo demo = new WaitDemo();
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
		
	}

}

class WaitDemo implements Runnable {
	
	int i = 0;
	
	public synchronized boolean print() {
		notifyAll();
		if (i <= 100) {
			System.out.println(Thread.currentThread().getName() + ":" + i++);
			try {
				wait();
			} catch (InterruptedException e) {
			}
			return true;
		}
		return false;
	}

	@Override
	public void run() {
		while(print())
			;
	}
	
}