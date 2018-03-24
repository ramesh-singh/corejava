package com.mypackage.thread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println("Current loop count is: "+ i);
			if(i%10==0){
				System.out.println(100-i+ " remaining.");
			}
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
