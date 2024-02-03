package com.springCollection.Properties;

import java.util.Properties;


public class StudentPropertiesCI {
	private String name;
	private Properties props;
	
	public StudentPropertiesCI(String name, Properties props) {
		super();
		this.name = name;
		this.props = props;
	}
	public StudentPropertiesCI() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentPropertiesCI [name=" + name + ", props=" + props + "]";
	}
	
	
	
}
