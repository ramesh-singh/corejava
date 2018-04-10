package com.mypackage.entity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int size;
	private transient Collar collar;
	
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
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		oos.writeInt(collar.getSize());
	}
	
	private void readObject(ObjectInputStream ois) throws Exception, IOException{
		ois.defaultReadObject();
		collar= new Collar(ois.readInt());
	}
	
	
}
