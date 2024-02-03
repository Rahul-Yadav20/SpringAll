package com.springcore.Reference.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationConext context = new ClassPathXmlApplicationContext("com.springcore.Reference.ref.EmployeeConfig.xml");
		//Employee emp1 = context.getBean 
		ApplicationContext con = new  ClassPathXmlApplicationContext("com/springcore/Reference/ref/EmployeeConfig.xml");
		Employee emp = con.getBean("emp1", Employee.class) ;
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getAddress());
	}

}
