package com.mypackage.domain;

import java.util.Date;

public class Employee {
	private int EmployeeId;
	private int EmplpoyeeName;
	private float salary;
	private Date dob;
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public int getEmplpoyeeName() {
		return EmplpoyeeName;
	}
	public void setEmplpoyeeName(int emplpoyeeName) {
		EmplpoyeeName = emplpoyeeName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Employee && this.EmployeeId==((Employee)obj).EmployeeId){
			return true;
		}else{
			return false;
		}
	}
	
	public int hashcode(){
		return EmployeeId;
	}

}
