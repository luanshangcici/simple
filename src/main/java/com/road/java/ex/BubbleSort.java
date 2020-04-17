package com.road.java.ex;

import java.util.Arrays;

/**
 * 一个数组{8,54,62,15,25,35,52,18,42},使用冒泡排序法对其进行排序
 * 
 * @author Administrator
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = { 8, 54, 62, 15, 25, 35, 52, 18, 42 };
		bs.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void bubbleSort(int[] arr) {
		int tmp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
