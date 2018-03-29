package com.mypackage.main;

import com.mypackage.entity.Counter;
import com.mypackage.threads.IncrementCounter;

public class AppMain {
	public static void main(String[] args) throws InterruptedException {
		Counter counter= new Counter();
		
		Thread t1 = new IncrementCounter(counter);
		Thread t2 = new IncrementCounter(counter);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
	}

}
