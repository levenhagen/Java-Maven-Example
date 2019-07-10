package com.redhat.main;

public class Company {
	
	private String name;
	
	public Company() {
		// TODO Auto-generated constructor stub
		this.name = "No name set.";
	}
	
	public Company(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
