package com.springJdbc;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TeaMain {
	public static void main(String[] args) {
		ApplicationContext con = new  ClassPathXmlApplicationContext("com/SpringJdbc/TeaConfig.xml");
		JdbcTemplate t= con.getBean("jdbc", JdbcTemplate.class);
		
		// Insert Query
		String query = "insert into teacher(id, name, subject, rating) values(?, ?, ?, ?)";
		// Fire query
		int result = t.update(query, 9839, "Ravi", "Hindi", 8);
		System.out.println("number of record inserted.."+result);
	}
}
