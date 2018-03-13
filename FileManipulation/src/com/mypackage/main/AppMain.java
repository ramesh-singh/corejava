package com.mypackage.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppMain {
	public static void main(String[] args) {
		System.out.println("---------Naked I/O Operations--------------");
		try{
			File file= new File("file1.txt");
			FileWriter writer= new FileWriter(file);
			writer.write("Hello\nUniverse!!!");
			writer.flush();
			writer.close();
			
			char [] in= new char[50];
			int size=0;
			
			FileReader reader= new FileReader(file);
			size= reader.read(in);
			System.out.println(size);
			
			for(char ch: in){
				System.out.print(ch);
			}
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
