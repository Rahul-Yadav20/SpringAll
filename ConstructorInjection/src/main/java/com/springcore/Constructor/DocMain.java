package com.springcore.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Constructor/DocConfig.xml");
		Doctor doc = context.getBean("doc1", Doctor.class);
		System.out.println(doc);
		System.out.println(doc.dept.toString());

	}
}
