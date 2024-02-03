package com.AutoWiring.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Doctor 
{	

	private String name;
	private String dept;
	
	@Autowired
	@Qualifier("patient")	// Qualifier annotation is used to specify which bean will be called of Patient from config file
	private Patient patient;
	
	public Doctor(String name, String dept, Patient patient) {
		super();
		this.name = name;
		this.dept = dept;
		this.patient = patient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Patient getPatient() {
		return patient;
	}
	// You can also use @Autowired annotation here
	public void setPatient(Patient patient) {
		this.patient = patient;
		System.out.println("Hello set");
	}
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", dept=" + dept + "]\n" + patient;
	}
}
