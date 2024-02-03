package com.springcore_list;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentList {
	private String name;
	private List<String> phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	
	public StudentList(String name, List<String> phone) {
		super();
		this.name = name;
		this.phone = phone;
		
	}
	public StudentList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
