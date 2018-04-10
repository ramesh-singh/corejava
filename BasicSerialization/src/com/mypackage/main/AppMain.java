package com.mypackage.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mypackage.entity.Cat;

public class AppMain {
	public static void main(String[] args) {
		Cat cat= new Cat(2, 5);
		System.out.println("Cat Dimensions before serialization:" + cat.getHeight()+" "+ cat.getWidth());
		
		try {
			FileOutputStream outputStream= new FileOutputStream("catSer.ser");
			ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(cat);
			objectOutputStream.close();
			
			FileInputStream fileInputStream= new FileInputStream("catSer.ser");
			ObjectInputStream inputStream= new ObjectInputStream(fileInputStream);
			Cat cat1= (Cat)inputStream.readObject();
			inputStream.close();
			
			System.out.println("Cat Dimensions after serialization:" + cat1.getHeight()+" "+ cat1.getWidth());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
