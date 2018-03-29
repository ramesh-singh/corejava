package com.mypackage.entity;

public class Reader {
	private Calculator calculator;

	public Reader(Calculator calculator) {
		this.calculator= calculator;
	}

	public void readTotal(){
		synchronized (calculator) {
			while(true){
			try{
				System.out.println("Waiting for calculation....");
				
					if(calculator.getTotal()==0){
						calculator.wait();
					}

				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(calculator.getTotal());
			}
		}

	}

}
