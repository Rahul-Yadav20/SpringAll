package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudent(Student st) {
		
		boolean flag = false;
		try {
			// JDBC code
			Connection con = ConnectionManager.createConnection();
			
			String query = "insert into students(name, id, phone, city) value(?, ?, ?, ?)";
			
			// Prepared Statement 
			PreparedStatement ps = con.prepareStatement(query);
			
			// Pass values to question marks in query
			ps.setString(1, st.getsName());	
			ps.setInt(2, st.getsId());	
			ps.setString(3, st.getsPhone());
			ps.setString(4, st.getsCity());
			
			// Execute the query
			ps.executeUpdate();
			flag=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static boolean deleteStudent(int id) {
		boolean flag = false;
		try {
			// JDBC code
			Connection con = ConnectionManager.createConnection();
			
			String query = "delete from students where id=?";
			
			// Prepared Statement 
			PreparedStatement ps = con.prepareStatement(query);
			
			// Pass values to question marks in query
				
			ps.setInt(1, id);	
			
			
			// Execute the query
			ps.executeUpdate();
			flag=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public static void showDetails() {
		
		try {
			// JDBC code
			Connection con = ConnectionManager.createConnection();
			
			String query = "select * from students";
			
			// Prepared Statement 
			Statement ps = con.createStatement();
			
			ResultSet set = ps.executeQuery(query);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone No : "+phone);
				System.out.println("City : "+city);
				
				System.out.println("***************************");
			}
			
			// Execute the query
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
