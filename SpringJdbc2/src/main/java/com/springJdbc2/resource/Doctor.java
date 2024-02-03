package com.springJdbc2.resource;

/**
 * Hello world!
 *
 */
public class Doctor {
	private int id;
	private String name;
	private String dept;
	private int phone;
	private String address;
	
	
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", dept=" + dept + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
}
