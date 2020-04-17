package com.road.lesson7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 1. 创建多线程的方式3：实现Callable接口。相较于Runnable接口的方式，call方法是有返回值的，并且可以抛出异常。
 * 2. 执行Callable方式，相较于Runnable，需要FutureTask实现类的支持，用于接收运行结果。
 */
public class TestCallable {
	
	public static void main(String[] args) {
		CallableDemo demo = new CallableDemo();
		
		FutureTask<Integer> ft = new FutureTask<>(demo);
		
		Thread t = new Thread(ft);
		t.start();
		
		try {
			int sum = ft.get();
			System.out.println(sum);
		} catch (InterruptedException | ExecutionException e) {
		}
		
	}
}

class CallableDemo implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			sum += i;
		}
		
		return sum;
	}
	
}