package EmployeeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	static Connection con;

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "root";
			String password = "r4#Rahul";
			String url = "jdbc:mysql://localhost:3306/employee_management";
			
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

}
