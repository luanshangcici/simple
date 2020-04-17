package com.road.lesson7;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduleThreadPool {
	
	public static void main(String[] args) {
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
			pool.schedule(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + "-----");
				}
			}, 2, TimeUnit.SECONDS);
		}
		
		
		pool.shutdown();
	}

}
