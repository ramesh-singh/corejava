package com.mypackage.main;

import com.mypackage.entity.Calculator;
import com.mypackage.entity.Reader;

public class AppMain {
	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		Reader reader= new Reader(calculator);
		Thread t1= new Thread(){
			public void run(){
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