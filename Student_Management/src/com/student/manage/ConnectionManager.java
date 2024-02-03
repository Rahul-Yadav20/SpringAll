package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
			
	static Connection con;
		
	public static Connection createConnection() {
			
			try {
				
				// Loading Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// Create connection 
				String user = "root";
				String password = "r4#Rahul";
				String url = "jdbc:mysql://localhost:3306/manage";
				
				con = DriverManager.getConnection(url, user, password);
			
			}catch(Exception e){
				e.printStackTrace();
			}
			return con;
		}
}
