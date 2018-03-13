package com.mypackage.main;

public class MainApp {
	public static void main(String[] args) {
		String s1="India is my country";
		
		System.out.println("Original String: " +s1);
		
		String [] strArr= s1.split(" ");
		
		for(int i=strArr.length-1; i>=0;i--){
			System.out.print(strArr[i]);
			if(i != 0){
				System.out.print(" ");
			}
		}
	}

}
