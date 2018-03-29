package com.mypackage.entity;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Calculator {
	private int total;

	public void total(Lock lock, Condition condition){
		lock.lock();
		try{
		System.out.println("Doing calculations..");
		for(int i= 0; i<100; i++){
			total+= i;
		}
		condition.signalAll();
		}finally{
			lock.unlock();
		}

	}

	public int getTotal(){
		return total;
	}

}
