package com.springcore_set;


import java.util.Set;

public class StudentSet {
	private String name;
	private Set<String> address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	
	
	public StudentSet(String name, Set<String> address) {
		super();
		this.name = name;
		this.address = address;
	}
	public StudentSet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
