package com.springJdbc2.resource;

public class Patient{
	private String pName;
	private String disease;
	
	

	public Patient(String pName, String disease) {
		super();
		this.pName = pName;
		this.disease = disease;
	}
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	
	@Override
	public String toString() {
		return "Patient [name=" + pName + ", disease=" + disease + "]";
	}


	
	
	
}
