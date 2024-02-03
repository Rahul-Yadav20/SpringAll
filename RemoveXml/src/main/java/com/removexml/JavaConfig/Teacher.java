package com.removexml.JavaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


/**
 * Hello world!
 *
 */

// @Component("obj")	// We can use @Bean annotation in java configuration file 
@Configuration()
public class Teacher 
{	
	@Value("JD")
	private String name;
	@Value("LONDON")
	private String address;
	
	private Salary sal; 
	
	public Teacher(Salary sal) {
		super();
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
	
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}
	
	
}
