package com.mypackage.threads;

import com.mypackage.entity.Counter;

public class IncrementCounter extends Thread{
	private Counter counter;
	
	public IncrementCounter(Counter counter) {
		this.counter= counter;
	}
	
	@Override
	public void run(){
		for(int i=0; i<1000; i++){
			counter.incrementCount();
		}
	}

}
