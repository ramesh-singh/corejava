package com.mypackage.entity;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Reader {
	private Calculator calculator;

	public Reader(Calculator calculator) {
		this.calculator= calculator;
	}

	public void readTotal(Lock lock, Condition condition){
		lock.lock();

		try{
			System.out.println("Awaiting for calculator to finish calculating..");
			
				condition.await();
			

		}catch(InterruptedException e){
			e.printStackTrace();
		}
		finally{
				lock.unlock();
		}
		
		System.out.println(calculator.getTotal());

	}

}
