package com.springJdbc2.dao;


import java.util.List;

import com.springJdbc2.resource.Doctor;



// This dao class have all function which we will implement in DaoImpl class
public interface DoctorDao {
	public int insert(Doctor doctor);
	public int modify(Doctor doctor);
	public int delet(Doctor doctor);
	public Doctor display(int id);
	public List<Doctor> displayAll();
}
