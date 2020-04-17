package com.road.lesson3.ex;

public class Ex1 {
	
	public static void main(String[] args) {
		Ex1_1 ex1 = new Ex1_1();
		System.out.println(ex1.mOL(2));
		System.out.println(ex1.mOL(2, 3));
		System.out.println(ex1.mOL(""));

		Ex1_2 ex2 = new Ex1_2();
		System.out.println(ex2.max(3, 4));
		System.out.println(ex2.max(3.1, 4.9));
		System.out.println(ex2.max(8.2, 3.5, 4.3));
	}

}

class Ex1_2{
	/*
	 * 2.定义三个重载方法max，
	 * 第一个方法求两个int值中的最大值，
	 * 第二个方法求两个double值中的最大值，
	 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
	 */
	
	public int max(int i, int j){
		return i > j ? i : j;
	}
	
	public double max(double i, double j){
		return i > j ? i : j;
	}
	
	public double max(double i, double j, double k){
		return max(max(i, j), k);
	}
	
}

class Ex1_1{
	/*
	 * 1.编写程序，定义三个重载方法并调用。方法名为mOL。
		三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符 CallMOL串信息。
		在主类()的main方法中分别用参数区别调用三个方法。
	 */
	
	public int mOL(int i){
		return i * i;
	}
	
	public int mOL(int i, int j){
		return i * j;
	}
	
	public String mOL(String str){
		return "CallMOL";
	}
	
}