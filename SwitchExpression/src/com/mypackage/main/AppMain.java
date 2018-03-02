package com.mypackage.main;

public class AppMain {
	public static void main(String[] args) {
		String dayOfWeek= "Friday";
		
		switch (dayOfWeek){
		case "Monday": {
			System.out.println("Help yourself!!!");
			break;
		}
		case "Tuesday": {
			System.out.println("Hangin there buddy!!!");
			break;
		}
		case "Wednesday": {
			System.out.println("keep pushing you will make it through!!!");
			break;
		}
		case "Thrusday": {
			System.out.println("Don't worry almost there!!!");
			break;
		}
		case "Friday": {
			System.out.println("Huuraahh the day has come!!!");
			break;
		}
		case "Saturday": {
			System.out.println("Party like there is not tomorrow!!!");
			break;
		}
		case "Sunday": {
			System.out.println("Panic mode on!!!");
			break;
		}
		default:{
			System.out.println("What day it is!!!");
		}
		}
	}

}
