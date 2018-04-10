package com.mypackage.entity;

import java.io.Serializable;

public class Dog implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int size;
	private Collar collar;
	
	public Dog(int size, Collar collar) {
		this.size= size;
		this.collar= collar;
	}

	public int getSize() {
		return size;
	}

	public Collar getCollar() {
		return collar;
	}
	
	
}
