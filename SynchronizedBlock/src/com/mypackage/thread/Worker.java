package com.mypackage.thread;

public class Worker extends Thread{
	private StringBuilder letter;
	
	public Worker(StringBuilder letter) {
		this.letter= letter;
	}
	
	@Override
	public void run(){
		synchronized (letter) {
			for(int i=0; i<100; i++){
				System.out.print(letter);
			}
			System.out.println();
			char ch= letter.charAt(0);
			ch++;
			letter.setCharAt(0, ch);
		}
	}

}
