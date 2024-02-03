package com.springcore_properties;

import java.util.Properties;


public class StudentProperties {
	private String name;
	private Properties props;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	
	
	
	public StudentProperties(String name, Properties props) {
		super();
		this.name = name;
		this.props = props;
	}
	public StudentProperties() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
