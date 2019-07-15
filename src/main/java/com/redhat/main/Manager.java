package com.redhat.main;

public class Manager extends Employee{
	
	public Manager() {}
	
	public void increaseWage(Employee e) {
		e.setSalary(e.getSalary() * 1.1);
	}
}