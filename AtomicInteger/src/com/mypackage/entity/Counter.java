package com.mypackage.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	//private int count;
	private AtomicInteger count= new AtomicInteger();
	public void incrementCount(){
		count.getAndIncrement();
	}
	
	public int getCount(){
		return count.intValue();
	}

}
