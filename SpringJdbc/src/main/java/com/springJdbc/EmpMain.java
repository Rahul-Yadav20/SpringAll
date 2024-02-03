package com.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.dao.EmployeeDao;
import com.springJdbc.entites.Employee;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springJdbc/EmpConfig.xml");
		/*
		 * // spring jdbc --> JdbcTemplate JdbcTemplate temp =
		 * con.getBean("jdbcTemplate", JdbcTemplate.class);
		 * 
		 * // insert query String query =
		 * "insert into EmpDetails(id, name, desi, address, salary) values(?, ?, ?, ?, ?)"
		 * ;
		 * 
		 * //Fire query //int result = temp.update(query, 3545, "Rahul Yadav",
		 * "Associate Engineer", "Noida", 10000); int result2 = temp.update(query, 3385,
		 * "Nitish Rana", "System Engineer", "Banglore", 20000);
		 * //System.out.println("Number of rows inserted..."+result);
		 * System.out.println("Number of rows inserted..."+result2);
		 */
		EmployeeDao em = con.getBean("emp", EmployeeDao.class);
		Employee emp = new Employee();
		Salary pt = new Salary();
		emp.setId(8132);
		emp.setName("Bira Singh");
		emp.setDesignation("NonTech");
		emp.setAddress("Delhi");
		pt.setSal(34793);
		int result = em.insert(emp, pt);
		System.out.println("Inserted Row..."+result);
	}
}
