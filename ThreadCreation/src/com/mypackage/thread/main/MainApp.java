package com.mypackage.thread.main;

import com.mypackage.thread.MyRunnable;
import com.mypackage.thread.MyThread;

public class MainApp {
	public static void main(String[] args) {
		
		System.out.println("Main executing....");
		Thread t1= new MyThread();
		t1.setName("t1");
		t1.start();
		
		Thread t2= new MyThread();
		t2.setName("t2");
		t2.start();
		
		Thread t3= new MyThread();
		t3.setName("t3");
		t3.start();
		
		Runnable r1= new MyRunnable();
		Thread t4= new Thread(r1);
		t4.setName("r1");
		t4.start();
		
		Runnable r2= new MyRunnable();
		Thread t5= new Thread(r2);
		t5.setName("r2");
		t5.start();
		
		Runnable r3= new MyRunnable();
		Thread t6= new Thread(r3);
		t6.setName("r3");
		t6.start();
		
		System.out.println("Main ending....");
		
		
	}

}
