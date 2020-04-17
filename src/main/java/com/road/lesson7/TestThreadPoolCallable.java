package com.road.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TestThreadPoolCallable {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
		List<ScheduledFuture<Integer>> results = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			ScheduledFuture<Integer> result = pool.schedule(new Callable<Integer>() {
				
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i = 0; i < 1001; i++) {
						sum += i;
					}
					return sum;
				}
			}, 2, TimeUnit.SECONDS);
			results.add(result);
		}
		
		for (ScheduledFuture<Integer> result : results) {
			System.out.println(result.get());
		}

		pool.shutdown();
	}

}
