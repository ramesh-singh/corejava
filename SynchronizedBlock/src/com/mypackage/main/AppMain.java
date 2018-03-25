package com.mypackage.main;

import com.mypackage.thread.Worker;

public class AppMain {
	public static void main(String[] args) {
		StringBuilder letter= new StringBuilder("A");
		new Worker(letter).start();
		new Worker(letter).start();
		new Worker(letter).start();
	}

}
