package com.mypackage.main;

import java.util.Date;

import com.mypackage.domain.Employee;

public class AppMain {
	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setEmployeeId(1);
		employee.setEmplpoyeeName("Employee Name");
		employee.setSalary(70500.0f);
		employee.setDob(new Date("05/12/1987"));
		
		System.out.println(employee);
		
	}

}
