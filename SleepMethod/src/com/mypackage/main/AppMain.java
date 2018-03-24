package com.mypackage.main;

import com.mypackage.thread.MyRunnable;

public class AppMain {
	public static void main(String[] args) {
		Runnable r1= new MyRunnable();
		Thread t1= new Thread(r1);
		t1.start();
	}

}
