package com.springJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.Salary;
import com.springJdbc.entites.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbc;
	
	public int insert(Employee employee, Salary salary) {
		
		// insert query
		String query = "insert into EmpDetails(id, name, desi, address, salary) values(?, ?, ?, ?, ?)";
		int result = this.jdbc.update(query, employee.getId(), employee.getName(), employee.getDesignation(), employee.getAddress(), salary.getSal());	
		return result;
	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	
	
	
}
