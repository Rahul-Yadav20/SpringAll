package com.springCollection.Map;


import java.util.Map;


public class StudentMapCI {
	private String name;
	private Map<String, String> course;
	
	public StudentMapCI(String name, Map<String, String> course) {
		super();
		this.name = name;
		this.course = course;
	}
	public StudentMapCI() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentMapCI [name=" + name + ", course=" + course + "]";
	}
	
	
	
}
