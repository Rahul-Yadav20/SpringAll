package EmployeeDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDAO {

	public static boolean insertEmployee(Employee ed) {
		boolean flag = false;
		try {

			Connection con = ConnectionManager.createConnection();
			String query = "insert into employee(id, name, phone, location) values(?, ?, ?, ?);";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, ed.getId());
			ps.setString(2, ed.getName());
			ps.setString(3, ed.getPhone());
			ps.setString(4, ed.getLocation());

			ps.executeUpdate();
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteEmployee(int id) {
		boolean flag = false;
		try {
			Connection con = ConnectionManager.createConnection();
			String query = "delete from employee where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void showDetails() {
		
		try {
			Connection con = ConnectionManager.createConnection();
			String query = "select * from employee";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String city = rs.getString(4);

				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Phone No : " + phone);
				System.out.println("City : " + city);

				System.out.println("***************************");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
