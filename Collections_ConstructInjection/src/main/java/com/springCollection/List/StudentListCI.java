package com.springCollection.List;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentListCI {
	private String name;
	private List<String> phone;
	
	
	public StudentListCI(String name, List<String> phone) {
		super();
		this.name = name;
		this.phone = phone;
		
	}
	public StudentListCI() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentList [name=" + name + ", phone=" + phone + "]";
	}
	
}
