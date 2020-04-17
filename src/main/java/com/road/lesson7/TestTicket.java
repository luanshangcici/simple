package com.road.lesson7;

/**
 * 模拟3个人，张飞、关羽和刘备，来买电影票，售票员只有一张5元的钱，电影票5元钱一张：
 * 张飞拿20元一张的人民币排在关羽和刘备的前面，
 * 关羽和刘备各拿了一张5元的人民币买票。
 * 因此张飞必须等待（还是关羽和刘备先买了票）
 *
 */
public class TestTicket {
	
	public static void main(String[] args) throws InterruptedException {
		TicketDemo demo = new TicketDemo();
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		Thread t3 = new Thread(demo);
		
		t1.setName("zf");
		t2.setName("gy");
		t3.setName("lb");
		
		t1.start();
		Thread.sleep(100);
		t2.start();
		Thread.sleep(100);
		t3.start();
	}

}

class TicketDemo implements Runnable {
	
	int five = 1;

	@Override
	public void run() {
		buy();
	}

	private synchronized void buy() {
		if ("zf".equals(Thread.currentThread().getName())) {
			while (five < 3) {
				System.out.println("张飞需要等待,当前five=" + five);
				try {
					wait();
				} catch (InterruptedException e) {
				}
			} 
			five -= 3;
			System.out.println("卖一张票给张飞,当前five=" + five);
		} else if("gy".equals(Thread.currentThread().getName())) {
			five++;
			System.out.println("卖一张票给关羽,当前five=" + five);
		} else if ("lb".equals(Thread.currentThread().getName())) {
			five++;
			System.out.println("卖一张票给刘备,当前five=" + five);
		}

		notify();
	}

}