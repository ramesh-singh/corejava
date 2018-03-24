package com.mypackage.thread;

public class MyThread extends Thread {
	@Override
	public void run(){
		System.out.println("My Thread running." +getName());
	}

}
