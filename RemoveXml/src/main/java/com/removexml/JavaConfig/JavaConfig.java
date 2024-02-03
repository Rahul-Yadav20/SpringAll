package com.removexml.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration	// COnfiguration annotation defines that this is our config class (like xml)
@ComponentScan(basePackages = "com.removexml.JavaConfig")
public class JavaConfig {
	
	@Bean
	public Salary getSal() {
		Salary sal = new Salary();
		return sal;
	}
	
	
	@Bean
	public Teacher getTeacher() // THis method name will be work as bean of Teacher class
	{							// And getTeacher use as bend id in getBean() in Main class
		
		Teacher t = new Teacher(getSal());
		return t;
	}
	
	/*// And getTeacher use as
	 * bend id in getBean() in Main class
	 * // THis
	 *method name will be work as bean of Teacher class 
	 * @Bean(name= {"teacher", "tea", "sir")) Can also use like this 	
	 * public Teacher getTeacher() 
	 * { 
	 * 
	 * Teacher t = new Teacher(getSal()); return t; }
	 */
}
