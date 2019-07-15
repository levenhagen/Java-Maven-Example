package com.redhat.main;

public abstract class Employee implements Checkable{
	
	private String username;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void checkRegistry() {
		System.out.print((firstName != null) ? "First Name:" + this.firstName + "\n" : "");
		System.out.print((lastName != null) ? "Last Name:" + this.lastName + "\n" : "");
		System.out.print((address != null) ? "Address:" + this.address + "\n" : "");
		System.out.print((phone != null) ? "Phone:" + this.phone + "\n" : "");
		System.out.print((salary != 0) ? "Salary:" + this.salary + "\n" : "");
	}
}
