package com.mypackage.domain;

public class Person {
	private String name;
	private int age;
	private float salary;
	private Gender gender;
	
	
	public Person(String name, int age, float salary, Gender gender) {
		this.name= name;
		this.age= age;
		this.salary= salary;
		this.gender= gender;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary
				+ ", gender=" + gender + "]";
	}
	
	
	

}
