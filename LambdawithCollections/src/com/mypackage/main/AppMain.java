package com.mypackage.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
		Person p8= new Person("Mid", 45, 100000f, Gender.MALE);
		
		
		List<Person> persons= new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		persons.add(p7);
		persons.add(p8);
		
		//Sorting persons on the basis of firstName
		System.out.println("Printing persons sorted on the basis of firstName");
		Collections.sort(persons, (person1, person2) -> person1.getName().compareTo(person2.getName()));
		
		printConditionally(persons, p -> true, p -> System.out.println(p));
		
		System.out.println("Printing persons with firstName starts with R");
		printConditionally(persons, p -> p.getName().startsWith("D"), p -> System.out.println(p));
		
		System.out.println("Printing all feamle");
		printConditionally(persons, p -> p.getGender().equals(Gender.FEMALE), p -> System.out.println(p.getName()));
		
	 
	}
	
	/*public static void  printConditionally(List<Person> persons, Condition condition){
		for(Person person: persons){
			if(condition.condition(person)){
				System.out.println(person);
			}
		}
	}*/
	
	//function with Predicate interface
	/*public static void  printConditionally(List<Person> persons, Predicate<Person> predicate){
		for(Person person: persons){
			if(predicate.test(person)){
				System.out.println(person);
			}
		}
	}*/
	
	//function with Consumer interface
		public static void  printConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer){
			for(Person person: persons){
				if(predicate.test(person)){
					consumer.accept(person);
				}
			}
		}
	

}
	

