package com.mypackage.domain;

import java.io.Closeable;

public class Two implements Closeable{

	@Override
	public void close() {
		System.out.println("Closing Two.");
		
	}

	
	

}