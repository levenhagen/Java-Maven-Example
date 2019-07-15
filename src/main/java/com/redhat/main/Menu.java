package com.redhat.main;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {
	
	private Scanner scanner;
	private Company company;
	
	private String currentOption;
	
	public Menu(Company c) {
		scanner = new Scanner(System.in);
		this.company = c;
		currentOption = ""; //default
	}
	
	public void runMenu() {
		
		//Init Message
		System.out.println(String.format("======= Menu of Company %s has started =======", company.getName()));
		
		//Loop/interaction with user
		while(!(currentOption.equals("0"))) { //boolean
			handleUserInput();
		}
		
		//scanner.close();
	}
	
	/**
	 * 
	 * Helper Method
	 * 
	 * Shows the user how to manage options.
	 * 
	 * **/
	private void showInfoToUser() {
		System.out.println(""
				+ "1. Insert an Employee.\n"
				+ "2. Edit an Employee\n"
				+ "3. Remove an Employee\n"
				+ "4. List an Employee\n"
				+ "5. List all Employees\n"
				+ "0. To exit.");
	}

	private void handleUserInput() {
		System.out.println("========= MAIN MENU =========");
		showInfoToUser();
		System.out.println("Pick an option:");	
		
		currentOption = scanner.next();
		
		switch(currentOption) {
			case "1":
				System.out.println("You picked "+ currentOption + ". Insert Employee.");
				company.addEmployee();
				currentOption = "";
				break;
			case "2":
				System.out.println("You picked "+ currentOption + ". Edit Employee.");
				company.editEmployee();
				currentOption = "";
				break;
			case "3":
				System.out.println("You picked "+ currentOption + ". Remove Employee.");
				company.removeEmployee();
				currentOption = "";
				break;
			case "4":
				System.out.println("You picked "+ currentOption + ". List Employee.");
				company.listEmployee();
				currentOption = "";
				break;
			case "5":
				System.out.println("You picked "+ currentOption + ". List Employees.");
				company.listEmployees();
				currentOption = "";
				break;
			case "0":
				System.out.println("You picked "+ currentOption + ". System is shutting down...");
				break;
			default:
				System.out.println("Unrecognized option. Please try again...");
				currentOption = "";
				break;
		}
	}
}