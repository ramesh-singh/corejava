package com.mypackage.main;

import com.mypackage.entity.Calculator;
import com.mypackage.entity.Reader;

public class AppMain {
	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		Reader reader= new Reader(calculator);
		Thread t1= new Thread(){
			public void run(){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				reader.readTotal();
			}
		};
		
		Thread t2= new Thread(){
			public void run(){
				calculator.total();
			}
		};
		
		t1.start();
		t2.start();
		//t3.start();
	}
}