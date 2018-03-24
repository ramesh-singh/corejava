package com.mypackage.main;

import com.mypackage.thread.MyRunnable;

public class AppMain {
	public static void main(String[] args) throws InterruptedException {
		Runnable r1= new MyRunnable();
		
		Thread t1= new Thread(r1);
		t1.setName("one");
		t1.start();
		
		Thread t2= new Thread(r1);
		t2.setName("two");
		t2.start();
		
		Thread t3= new Thread(r1);
		t3.setName("three");
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Main is exiting.");
	}

}
