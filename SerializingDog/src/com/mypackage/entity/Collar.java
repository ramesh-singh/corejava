package com.mypackage.entity;

import java.io.Serializable;

public class Collar implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int size;
	
	public Collar(int size) {
		this.size= size;
	}

	public int getSize() {
		return size;
	}

}
