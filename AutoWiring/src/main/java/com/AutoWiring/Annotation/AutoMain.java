package com.AutoWiring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/AutoWiring/Annotation/WiringConfig.xml");
		Doctor dc1 = context.getBean("doctor", Doctor.class);
		System.out.println(dc1);
	}
}
