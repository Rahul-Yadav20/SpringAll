package com.springJdbc.dao;

import com.springJdbc.Salary;
import com.springJdbc.entites.Employee;

public interface EmployeeDao {
	public int insert(Employee employee, Salary salary);
}
