package com.springCollection.Set;


import java.util.Set;

public class StudentSetCI {
	private String name;
	private Set<String> address;
	
	
	
	public StudentSetCI(String name, Set<String> address) {
		super();
		this.name = name;
		this.address = address;
	}
	public StudentSetCI() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "StudentSetCI [name=" + name + ", address=" + address + "]";
	}
	
}
