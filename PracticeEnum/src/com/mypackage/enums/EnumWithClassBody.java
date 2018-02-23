package com.mypackage.enums;

public enum EnumWithClassBody {
	BIG(8), HUGE(10), OVERWHELMMING(12){
		public String getLid(){
			return "C";
		}
	};
	
	private EnumWithClassBody(int size) {
		this.size= size;
	}
	
	private int size;
	
	public int getSize() {
		return size;
	}
	public String getLid() {
		return "B";
	}
	
	

}
