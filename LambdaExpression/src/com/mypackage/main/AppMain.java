package com.mypackage.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mypackage.domain.Gender;
import com.mypackage.domain.Person;

public class AppMain {
	public static void main(String[] args) {
		Person p1= new Person("Ramesh", 30, 65000f, Gender.MALE);
		Person p2= new Person("Iliyas", 27, 72000f, Gender.MALE);
		Person p3= new Person("Dipeeka", 27, 65000f, Gender.FEMALE);
		Person p4= new Person("Megha", 28, 80000f, Gender.FEMALE);
		Person p5= new Person("Baby1", 2, 20f, Gender.MALE);
		Person p6= new Person("Teenager", 14, 65000f, Gender.FEMALE);
		Person p7= new Person("Old", 30, 50000f, Gender.MALE);
		Person p8= new Person("mid", 45, 100000f, Gender.MALE);
		
		
		List<Person> persons= new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		persons.add(p7);
		persons.add(p8);
		
		//Person's name with age> 18 without streams
		List<String> names= new ArrayList<String>();
		
		for(Person person: persons){
			if(person.getAge()>18){
				names.add(person.getName().toUpperCase());
			}
		}
		System.out.println(names);
		
		//Person's name with age> 18 with streams
		List<String> names2= persons.stream().filter(abc -> abc.getAge()>18).map(people -> people.getName()).
				map(people -> people.toUpperCase()).collect(Collectors.toList());
				
	    System.out.println(names2);
		
	}

}
