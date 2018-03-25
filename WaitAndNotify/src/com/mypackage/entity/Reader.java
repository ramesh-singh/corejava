package com.mypackage.entity;

public class Reader {
	private Calculator calculator;

	public Reader(Calculator calculator) {
		this.calculator= calculator;
	}

	public void readTotal(){
		synchronized (calculator) {
			try{
				System.out.println("Waiting for calculation....");
			calculator.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(calculator.getTotal());
		}
		
	}

}
