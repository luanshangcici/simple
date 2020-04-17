package com.road.lesson6.ex;

public class ShareApple {

	public static void main(String[] args) {
		SynDemo sd = new SynDemo();
		Thread t1 = new Thread(sd, "小明");
		Thread t2 = new Thread(sd, "小红");

		t1.start();
		t2.start();
	}

}

class SynDemo implements Runnable {
	private int num = 5;
	private boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			test();
		}
	}

	public synchronized void test() {
//		 (this) {
			if (num <= 0) {
				flag = false;
				return;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + "抢到了苹果,剩余" + --num);
//		}
	}
}
