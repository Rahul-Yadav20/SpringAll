package EmployeeDatabase;

public class Employee {

	private int id;
	private String name;
	private String phone;
	private String location;
	public Employee(int id, String name, String phone, String location) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
