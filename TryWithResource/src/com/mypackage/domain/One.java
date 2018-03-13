package com.mypackage.domain;

public class One implements AutoCloseable{

	@Override
	public void close() throws Exception{
		System.out.println("Closing One.");
		//throw new Exception("Exception inside close method.");
		
	}
	

}
