package com.ioc;

public class Employee2 implements EmployeeInfo {
	private int id;
	private String Name;

	public Employee2(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	void display() {
		System.out.println("Employee2 id is : "+id);
		System.out.println("Employee2 Name is : "+Name);
	}
	
}
