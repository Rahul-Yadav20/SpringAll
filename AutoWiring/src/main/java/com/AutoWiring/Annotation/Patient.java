package com.AutoWiring.Annotation;

public class Patient {
	private String pName;
	private String disease;

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
		return "Patient [pName=" + pName + ", disease=" + disease + "]";
	}

}
