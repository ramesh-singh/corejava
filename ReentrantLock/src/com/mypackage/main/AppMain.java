package com.mypackage.main;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.mypackage.entity.Calculator;
import com.mypackage.entity.Reader;

public class AppMain {
	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		Reader reader= new Reader(calculator);
		
		Lock lock= new ReentrantLock();
		Condition condition= lock.newCondition();
		Thread t1= new Thread(){
			public void run(){
				reader.readTotal(lock, condition);
			}
		};
		
		Thread t2= new Thread(){
			public void run(){
				calculator.total(lock, condition);
			}
		};
		
		t1.start();
		t2.start();
		//t3.start();
	}
}