package com.springcore.BeanLifeUsingInterface;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeUsingInterface implements InitializingBean, DisposableBean {
	private List<String> name;
	private Set<String> course;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Set<String> getCourse() {
		return course;
	}
	public void setCourse(Set<String> course) {
		this.course = course;
	}
	public LifeUsingInterface(List<String> name, Set<String> course) {
		super();
		this.name = name;
		this.course = course;
	}
	public LifeUsingInterface() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LifeUsingInterface \n name=" + name + "\n course=" + course + "]";
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// Initialize method for bean using InitializingBean interface
		System.out.println("I am initializer method after setting properties");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// Destroy method for bean Using Disposable Interface
		System.out.println("I am destroy method");
	}
	
}
