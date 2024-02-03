package com.springJdbc2.dao;
import com.springJdbc2.resource.Doctor;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


// @Component("dao") // if you want to use Autowiring
public class DoctorDaoImpl implements DoctorDao {
	
	// @Autowired	// For Autowiring
	private JdbcTemplate jdbc1;
	
	// Function to insert the data
	public int insert(Doctor doctor) {
		// TODO Auto-generated method stub
			
			String query = "insert into doctorDetails(id, name, dept, phone, address) values(?, ?, ?, ?, ?)";
			int result = jdbc1.update(query, doctor.getId(), doctor.getName(), doctor.getDept(), doctor.getPhone(), doctor.getAddress());
			return result;
		}
		
	
	
	// Function to update any record in database
	public int modify(Doctor doctor) {
		// TODO Auto-generated method stub
		String query = "update doctordetails set phone=?, address=? where id=?";
		int update = jdbc1.update(query, doctor.getPhone(), doctor.getAddress(), doctor.getId());
		return update;
	}
	
	// Dunction to delete any record or row in database
	public int delet(Doctor doctor) {
		// TODO Auto-generated method stub
		String query = "delete from doctordetails where id=?";
		int del = jdbc1.update(query, doctor.getId());
		return del;
	}
	
	// Function to display a particular record with input of doctor id
	public Doctor display(int id) {
		// TODO Auto-generated method stub
		String query = "Select * from doctordetails where id=?";
		RowMapper<Doctor> rowMapper = new RowMapImpl();
		Doctor docobj = jdbc1.queryForObject(query, rowMapper, id);
		return docobj;
	}
	
	// Display all data of database
	public List<Doctor> displayAll() {
		
		String query = "select * from doctordetails";
		RowMapper<Doctor> rowMapper = new RowMapImpl();
		List<Doctor> doctor = jdbc1.query(query, rowMapper);
		return doctor;
	}
	
	
	public JdbcTemplate getJdbc() {
		return jdbc1;
	}
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc1 = jdbc;
	}

}
