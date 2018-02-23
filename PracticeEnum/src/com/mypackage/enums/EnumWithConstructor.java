package com.mypackage.enums;

public enum EnumWithConstructor {
	BIG(8, "A"),
	HUGE(10, "B"),
	OVERWHELMMING(12, "C");
	
	EnumWithConstructor(int size, String lid){
		this.size= size;
		this.lid= lid;
	}
	
	private int size;
	private String lid;
	
	public int getSize() {
		return size;
	}
	public String getLid() {
		return lid;
	}
	
	
	
	

}
