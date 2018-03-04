package com.mypackage.main;

public class AppMain {
	public static void main(String[] args) {
		Greetings greetLambda= () -> System.out.println("Hello User");
		greetLambda.greet();
		
		greet(() -> System.out.println("Hello User"));
		
		Thread mythread= new Thread(() -> System.out.println("Inside lambda run"));
		mythread.start();
	}
	
	public static void greet(Greetings greetings){
		greetings.greet();
	}
	
	

}
