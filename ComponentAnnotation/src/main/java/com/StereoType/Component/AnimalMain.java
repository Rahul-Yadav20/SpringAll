package com.StereoType.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/StereoType/Component/AnimalConfig.xml");
		Animal am = context.getBean("animal", Animal.class);	//animal is a auto generated object of class Animal by IOC container
																// If you have define Component("obj") then use obj instead of animal object
																//	getBean("obj", Animal.class)														
		System.out.println(am);
	}
}
