package com.mypackage.domain;

import java.util.Date;

public class Employee {
	private int EmployeeId;
	private String EmplpoyeeName;
	private float salary;
	private Date dob;
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmplpoyeeName() {
		return EmplpoyeeName;
	}
	public void setEmplpoyeeName(String emplpoyeeName) {
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
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Employee && this.EmployeeId==((Employee)obj).EmployeeId){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		return EmployeeId;
	}
	
	@Override
	public String toString() {
		
		return "Employee: [ Emplyee Id: " +EmployeeId + ", EmployeeName: "+EmplpoyeeName+ ", salary: "+salary
				+", DOB: "+ dob+ " ]";
	}
	
	
	
	
	

}
