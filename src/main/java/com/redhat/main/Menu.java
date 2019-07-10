package com.redhat.main;

import java.util.Scanner;

public class Menu {
	
	private Scanner scanner;
	private Company company;
	
	private int currentOption;
	
	public Menu(Company c) {
		scanner = new Scanner(System.in);
		this.company = c;
		currentOption = 100; //default
	}
	
	public void runMenu() {
		System.out.println(String.format("======= Menu of Company %s has started =======", company.getName()));
		
		showInfoToUser();
		
		//loop/iterations through options
		while(currentOption != 0) { //boolean
			handleUserInput();
		}

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
				+ "0. to exit.");
	}

	private void handleUserInput() {
		System.out.println("Pick an option:");
		currentOption = scanner.nextInt();
		switch(currentOption) {
			case 1:
				System.out.println("You picked "+ currentOption + ". Inserting Employee.");
				//Create Employee
				break;
			case 2:
				System.out.println("You picked "+ currentOption + ". Listing Employee.");
				//Read Employee
				break;
			case 3:
				System.out.println("You picked "+ currentOption + ". Editing Employee.");
				//Update Employee
				break;
			case 4:
				System.out.println("You picked "+ currentOption + ". Removing Employee.");
				//Delete Employee
				break;
			case 0:
				System.out.println("You picked "+ currentOption + ". System is shutting down...");
				break;
			default:
				System.out.println("Wtf you picked dude?!");
				break;
		}
	}
}
