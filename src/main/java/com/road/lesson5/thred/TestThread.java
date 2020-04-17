package com.road.lesson5.thred;

public class TestThread {
	
	int i = 0;

	public static void main(String[] args) {

//		TestThread tt = new TestThread();
//		TestThread tt2 = new TestThread();
//
//		Thread t1 = new ThreadDemo(tt);
//		t1.setName("t1");
//		t1.start();
//
//		Thread t2 = new ThreadDemo(tt2);
//		t2.setName("t2");
//		t2.start();
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName() + ":" + i);
//		}

//		Thread t1 = new Thread(new RunnableDemo());
//		Thread t2 = new Thread(new RunnableDemo());

		RunnableDemo demo = new RunnableDemo();
		
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();

	}

}

class ThreadDemo extends Thread {
	
//	static int i = 0;
	
	TestThread tt;

	public ThreadDemo() {
		super();
	}

	public ThreadDemo(TestThread tt) {
		super();
		this.tt = tt;
	}

	public void run() {
		for (; tt.i < 100; tt.i++) {
			System.out.println(Thread.currentThread().getName() + ":" + tt.i);
		}
	}
}

class RunnableDemo implements Runnable {
	
	int i = 0;

	@Override
	public void run() {
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
}