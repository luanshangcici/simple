package com.road.lesson6;

/**
 * 
 * 1. 两个普通的同步方法，两个线程						打印结果：	1 2
 * 2. 新增Thread.sleep()给printOne				打印结果： 1 2
 * 3. 新增一个普通方法printThree					打印结果： 3 1
 * 4. 两个同步方法，两个Number对象					打印结果： 2 1
 * 5. 修改printOne()为静态同步方法，一个对象			打印结果： 2 1
 * 6. 修改两个方法均为静态同步方法，一个对象				打印结果： 1 2
 * 7. 一个静态同步方法，一个普通同步方法，两个Number对象	打印结果： 2 1
 * 8. 两个静态同步方法，两个Number对象					打印结果：	1 2
 * 
 */
public class TestThreadMonitor {
	
	public static void main(String[] args) {

		Number n1 = new Number();
		Number n2 = new Number();
		
		new Thread(() -> {
			n1.printOne();
		}).start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		
		new Thread(() -> {
			n2.printTwo();
//			n1.printThree();
		}).start();
	}

}

class Number {
	
	// Number.class
	public static synchronized void printOne() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(1);
	}
	
	public static synchronized void printTwo() {
		System.out.println(2);
	}
	
	public void printThree() {
		System.out.println(3);
	}
}