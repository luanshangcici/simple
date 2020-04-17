package com.road.java.ex;

public class PrintStar {
	
	public static void main(String[] args) {
		PrintStar ps = new PrintStar();
		ps.print(3);
	}
	
	public void print(int count){
		// 上半部分
		for (int i = 1; i <= count; i++) {
			// 打印左边的空格
			for (int j = 1; j <= count - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= 2 * i -1; j++) {
				if (j == 1 || j == 2 * i -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 下半部分
		for (int i = count - 1; i >= 1; i--) {
			for (int j = count - 1; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= 2 * i -1; j++) {
				if (j == 1 || j == 2 * i -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
