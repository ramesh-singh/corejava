package com.mypackage;

import java.*;   // This is legal but will not search across all packages.
public class SampleCodes {
	
	//testing if variable name can contain special symbols after first letter
	
	//int test#;  ---Illegal identifier
	//int test-;  ---Illegal identifier
	int test$;    //--- legal identifier
	int test_;    //--- legal identifier

	public static void main(String[] args) {
		System.out.println("This is a class to test basic core java code snippets.");
		
		
		

	}

}
