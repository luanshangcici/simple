package com.road.lesson7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 1. 线程池：提供了一个线程队列，队列中保存着所有等待状态的线程(空闲)。避免了创建与销毁线程的额外开销，提升了响应速度。
 * 
 * 2. java中线程池的体系接口
 * java.util.concurrent.Executor:负责线程池的使用与调度的根接口
 *			|--ExecutorService:子接口，线程池的主要接口
 *					|--ThreadPoolExecutor：线程池的实现类
 *					|--ScheduledExecutorService：负责线程的调度
 *							|--ScheduledThreadPoolExecutor：继承ThreadPoolExecutor，实现了ScheduledExecutorService
 * 
 * 3 工具类：Executors
 * 3.1 ExecutorService newFixedThreadPool()：创建固定大小的线程池
 * 3.2 ExecutorService newCachedThreadPool()：缓存线程池，线程数量不固定，根据需要自动变更线程的数据量
 * 3.3 ExecutorService newSingleThreadExecutor()：创建单个线程池，线程中只有一个线程
 * 3.4 ScheduledExecutorService newScheduledThreadPool()：固定大小的线程池，可以延迟或者定时执行任务。
 */
public class TestThreadPool {
	
	public static void main(String[] args) {
		ThreadPoolDemo demo = new ThreadPoolDemo();
		
		ExecutorService pool1 = Executors.newFixedThreadPool(5);
		ExecutorService pool2 = Executors.newCachedThreadPool();
		ExecutorService pool3 = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 10; i++) {
			pool3.submit(demo);
		}
		
		pool1.shutdown();
		pool2.shutdown();
		pool3.shutdown();
		
	}

}

class ThreadPoolDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 101; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
