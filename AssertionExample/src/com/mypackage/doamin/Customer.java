package com.mypackage.doamin;

public class Customer {
	
	public int addAge(int age1, int age2){
		assert(age1>=0 && age2>=0): "Value of ag1: "+ age1+" Value of age2: "+age2;
		return age1+age2;
		
	}

}
