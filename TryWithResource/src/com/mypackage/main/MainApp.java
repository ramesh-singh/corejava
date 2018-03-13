package com.mypackage.main;

import java.io.IOException;
import java.sql.SQLException;

import com.mypackage.domain.One;
import com.mypackage.domain.Two;

public class MainApp {
	public static void main(String[] args) {
		try (One one= new One(); Two two=  new Two()){
			System.out.println("Inside try with resources.");
			//throw new RuntimeException("exception inside try with resource.");
		 } catch (SQLException | IOException e){
			 e.printStackTrace();
		 }
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Inside catch.");
		}finally{
			System.out.println("Inside finally block.");
		}
	}

}
