package com.student.manage;

public class Student {
	private String sName;
	private int sId;
	private String sCity;
	private String sPhone;
	public Student(String sName, int sId, String sCity, String sPhone) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.sCity = sCity;
		this.sPhone = sPhone;
	}
	public Student(String sName, String sCity, String sPhone) {
		super();
		this.sName = sName;
		this.sCity = sCity;
		this.sPhone = sPhone;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getsPhone() {
		return sPhone;
	}
	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sId=" + sId + ", sCity=" + sCity + ", sPhone=" + sPhone + "]";
	}
	
}
