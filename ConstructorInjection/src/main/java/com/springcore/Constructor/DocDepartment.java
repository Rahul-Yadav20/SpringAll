package com.springcore.Constructor;

/**
 * Hello world!
 *
 */
public class DocDepartment {
	private String dept;

	public DocDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocDepartment(String dept) {
		super();
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "DocDepartment [dept=" + dept + "]";
	}

}
