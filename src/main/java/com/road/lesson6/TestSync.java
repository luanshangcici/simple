package com.road.lesson6;

public class TestSync {
	
	public static void main(String[] args) {
		SyncDemo demo = new SyncDemo();
		
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
		
	}

}

class SyncDemo implements Runnable {
	
	int i = 0;
	Integer inte = new Integer(1);
	
	public synchronized boolean print() {
//		 synchronized (inte) {
			if (i <= 100) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
				i++;
				return true;
			}
			return false;
//		}
		
	}

	@Override
	public void run() {
		while(print())
			;
	}
	
}