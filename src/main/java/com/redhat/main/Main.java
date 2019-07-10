package com.redhat.main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World of Red Hat, this is App Demo.");
		
		Company myCompany = new Company("My Company");
		
		Menu menu = new Menu(myCompany);
		menu.runMenu();
	}
	
}
