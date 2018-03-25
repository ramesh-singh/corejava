package com.mypackage.entity;

public class Calculator {
	private int total;
	
	public void total(){
		synchronized (this) {
			System.out.println("Doing calculations..");
			for(int i= 0; i<100; i++){
				total+= i;
			}
			notifyAll();
		}
		
	}
	
	public int getTotal(){
		return total;
	}

}
