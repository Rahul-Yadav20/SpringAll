package com.springcore_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ListApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_list/ListConfig.xml");
		StudentList student1 = (StudentList) context.getBean("student1");
		System.out.println(student1.getName());
		System.out.println(student1.getPhone());
	}
}
