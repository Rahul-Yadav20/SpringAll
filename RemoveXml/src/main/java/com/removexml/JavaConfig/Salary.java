package com.removexml.JavaConfig;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;


public class Salary {
	
	private int salary=2000;

	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}
	
	
	/*
	 * public int getSalary() { return salary; }
	 * 
	 * public void setSalary(int salary) { this.salary = salary; }
	 */
}
