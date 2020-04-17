package com.road.lesson2;

public class TestArray {
	
	public static void main(String[] args) {
		int a[]={12,43,56,14,78,16,50,26,30,40};
		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > max) {
//				max = a[i];
//			}
//		}
//		System.out.println(max);
		
		for (int i : a) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
