package com.springcore.Reference.ref;

/**
 * Hello world!
 *
 */
public class Employee 
{
    private int id;
    private String name;
    EmployeeAdd address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeAdd getAddress() {
		return address;
	}
	public void setAddress(EmployeeAdd address) {
		this.address = address;
	}
	public Employee(int id, String name, EmployeeAdd address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
