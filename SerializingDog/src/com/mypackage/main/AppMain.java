package com.mypackage.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mypackage.entity.Collar;
import com.mypackage.entity.Dog;

public class AppMain {
	public static void main(String[] args) throws Exception {
		Collar collar= new Collar(5);
		Dog dog= new Dog(8, collar);
		
		System.out.println("Dog size before Serilaization: "+ dog.getSize());
		System.out.println("Dog collar's size before Serialization: "+ dog.getCollar().getSize());
		
		System.out.println("****Serializing Dog***********");
		
		FileOutputStream fos= new FileOutputStream("dogSer.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(dog);
		oos.close();
		
		System.out.println("****Deserializing Dog***********");
		
		FileInputStream fis= new FileInputStream("dogSer.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Dog dog1=(Dog) ois.readObject();
		ois.close();
		System.out.println("Dog size before Serilaization: "+ dog1.getSize());
		System.out.println("Dog collar's size before Serialization: "+ dog1.getCollar().getSize());
		
	}

}
