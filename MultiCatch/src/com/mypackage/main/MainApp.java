package com.mypackage.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws Exception{
		try{
			exception();
		}catch(Exception e){
			e.printStackTrace();
			e= new FileNotFoundException();
			throw (e);
		}
	}
	
	public static void exception() throws SQLException, IOException{
		
	}

}
