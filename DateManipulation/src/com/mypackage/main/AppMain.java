package com.mypackage.main;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppMain {
	public static void main(String[] args) {
		Date d1= new Date();
		System.out.println(d1.toString());
		System.out.println(d1.getTime());
		
		Calendar c1= Calendar.getInstance();
		c1.setTime(d1);
		
		if(Calendar.SUNDAY==c1.getFirstDayOfWeek()){
			System.out.println("Sunday is the first day of week.");
			System.out.println(c1.get(Calendar.DAY_OF_WEEK));
			c1.add(Calendar.DAY_OF_WEEK, 2);
			System.out.println(c1.getTime());
			c1.add(Calendar.DAY_OF_WEEK, 7);
			System.out.println(c1.getTime());
			c1.roll(Calendar.DAY_OF_WEEK, 10);
			System.out.println(c1.getTime());
			
			
			DateFormat df= DateFormat.getInstance();
			System.out.println(df.format(d1));
			
			DateFormat df1= DateFormat.getDateInstance();
			System.out.println(df1.format(d1));
			
			DateFormat df2= DateFormat.getDateInstance(DateFormat.SHORT);
			System.out.println(df2.format(d1));
		}
	}

}
