package com.mypackage.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppMain {
	public static void main(String[] args) {
		Callable<Integer> task= new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				
				return 1;
			}
		};
		
		ExecutorService pool= Executors.newCachedThreadPool();
		Future<Integer> i= pool.submit(task);
		try {
			System.out.println(i.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
