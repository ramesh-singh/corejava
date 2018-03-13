package com.mypackage.main;

public class DeadLockMain {
	
	public static void main(String[] args) {
		String s1= "Java";
		String s2= "Unix";
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					synchronized (s1) {
						synchronized (s2) {
							System.out.println(s1+s2);
						}
					}
				}
				
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					synchronized (s2) {
						synchronized (s1) {
							System.out.println(s2+s1);
							
						}
					}
				}
				
			}
		});
		
		t1.start();
		t2.start();
	}

}
