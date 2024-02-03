package com.ioc;

public class Employee1 implements EmployeeInfo {
	private int id;
	private String Name;

	public Employee1(int id, String name) {
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
		System.out.println("Employee1 id is : "+id);
		System.out.println("Employee1 Name is : "+Name);
	}
	
	public static void main(String[] args) {
		Employee1 em = Employee
	}
	
}
