package com.springcore.Constructor;

public class Doctor {
	private String name;
	private int id;
	DocDepartment dept;

	public Doctor(String name, int id, DocDepartment dept) {

		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + "]";
	}

}
