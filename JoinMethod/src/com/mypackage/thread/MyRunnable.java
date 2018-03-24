package com.mypackage.thread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<30; i++){
			System.out.println(Thread.currentThread().getName()+" running.");
		}
	}

}
