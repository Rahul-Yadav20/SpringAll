package com.springJdbc2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springJdbc2.resource.Doctor;
import com.springJdbc2.resource.Patient;


public class RowMapImpl implements RowMapper<Doctor> {

	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		doctor.setId(rs.getInt(1));
		doctor.setName(rs.getString(2));
		doctor.setDept(rs.getString(3));
		doctor.setPhone(rs.getInt(4));
		doctor.setAddress(rs.getString(5));
		return doctor;
		
	}
	
}
