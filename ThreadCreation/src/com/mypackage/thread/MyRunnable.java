package com.mypackage.thread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("My runnable running."+ Thread.currentThread().getName());
		
	}

}
