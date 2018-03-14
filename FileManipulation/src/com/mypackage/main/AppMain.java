package com.mypackage.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppMain {
	public static void main(String[] args) {
		System.out.println("---------Naked I/O Operations--------------");
		try {
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
		System.out.println();
		
		System.out.println("------------Wrapper I/O Operations------------------");
		PrintWriter writer= null;
		BufferedReader reader= null;
		try{
			File file2= new File("file2.txt");
			writer=new PrintWriter(file2);
			writer.println("Hello Universe!!!");
			writer.println("Lets stay strong.");
			writer.flush();
			
			FileReader fileReader= new FileReader(file2);
			reader = new BufferedReader(fileReader);
			String s="";
			while((s=reader.readLine())!= null){
				System.out.println(s);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			writer.close();
		}
		
		System.out.println("Creating, deleting and renaming files and directories");
		
		File myDir= new File("subDir");
		myDir.mkdir();
		
		File myFile= new File(myDir,"file3.txt");
		File renameFile= new File(myDir, "file4.txt");
		myFile.renameTo(renameFile);
		
		File renameDir= new File("childDirectory");
		myDir.renameTo(renameDir);
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
