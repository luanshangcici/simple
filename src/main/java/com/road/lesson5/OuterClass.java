package com.road.lesson5;

public class OuterClass {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		// 非静态内部类的创建
		InnerClass i = o.new InnerClass();
		i.test();
		
		// 静态内部类的创建
		InnerClass2 i2 = new OuterClass.InnerClass2();
		i2.test();
		
		// 匿名内部类
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(1);
			}
		});
		
		// lambda表达式
		Thread t2 = new Thread(() -> {
			System.out.println(1);
		});
		
		TestFly fly = new TestFly();
		fly.testFly(new Fly() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
		});
	}

	int o = 1;
	int i = 1;
	
	class InnerClass {
		
		int i = 2;
		
		public void test(){
			int i = 3;
			System.out.println("inner class");
			System.out.println(i);
			System.out.println(this.i);
			System.out.println(OuterClass.this.i);
		}
	}
	
	static class InnerClass2 {
		public void test() {
			System.out.println("inner class2");
//			System.out.println(o);
		}
	}
}
