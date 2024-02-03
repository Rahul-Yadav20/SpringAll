package com.springcore_map;


import java.util.Map;


public class StudentMap {
	private String name;
	private Map<String, String> course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	
	public StudentMap(String name, Map<String, String> course) {
		super();
		this.name = name;
		this.course = course;
	}
	public StudentMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
