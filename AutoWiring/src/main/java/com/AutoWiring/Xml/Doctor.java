package com.AutoWiring.Xml;

/**
 * Hello world!
 *
 */
public class Doctor 
{	
	public Doctor(Patient patient) {
		super();
//		this.name = name;
//		this.dept = dept;
		this.patient = patient;
		System.out.println("Hello COnstructor");
	}
	private String name;
	private String dept;
	private Patient patient;
	
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
