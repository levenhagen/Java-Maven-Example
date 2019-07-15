package com.redhat.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class InputHandler {
	Scanner scanner;
	
	public InputHandler() {
		scanner = new Scanner(System.in);
	}
	
	public Employee handleEmployeeCreation() {
		System.out.println("What type of employee is he?");
		System.out.println("1. Manager");
		System.out.println("2. Supervisor");
		System.out.println("3. Regular Dev");
		System.out.println("4. Junior Dev");
		System.out.println("Or type any character to return to the menu.");
		String type = scanner.next();
		switch(type) {
			case "1":
				Manager m = new Manager();
				System.out.println("First Name:");
				m.setFirstName(scanner.next());
				scanner.nextLine(); //debug
				System.out.println("Last Name:");
				m.setLastName(scanner.nextLine());
				System.out.println("Phone Number:");
				m.setPhone(scanner.nextLine());
				System.out.println("Adress:");
				m.setAddress(scanner.nextLine());
				System.out.println("Salary: (Please enter a number)");
				try {
					m.setSalary(scanner.nextDouble());
				}
				catch(InputMismatchException e){
					System.out.println("Salary could not be set.");
				}
				return m;
				
			case "2":
				Supervisor s = new Supervisor();

				System.out.println("First Name:");
				s.setFirstName(scanner.next());
				scanner.nextLine(); //debug
				System.out.println("Last Name:");
				s.setLastName(scanner.nextLine());
				System.out.println("Phone Number:");
				s.setPhone(scanner.nextLine());
				System.out.println("Adress:");
				s.setAddress(scanner.nextLine());
				System.out.println("Salary: (Please enter a number)");
				try {
					s.setSalary(scanner.nextDouble());
				}
				catch(InputMismatchException e){
					System.out.println("Salary could not be set.");
				}
				System.out.println("Section:");
				scanner.nextLine();//debug
				s.setSection(scanner.nextLine());
				System.out.println("Team:");
				s.setTeam(scanner.nextLine());
				
				return s;
				
			case "3":
				RegularDev rd = new RegularDev();
				System.out.println("First Name:");
				rd.setFirstName(scanner.next());
				scanner.nextLine(); //debug
				System.out.println("Last Name:");
				rd.setLastName(scanner.nextLine());
				System.out.println("Phone Number:");
				rd.setPhone(scanner.nextLine());
				System.out.println("Adress:");
				rd.setAddress(scanner.nextLine());
				System.out.println("Salary: (Please enter a number)");
				try {
					rd.setSalary(scanner.nextDouble());
				}
				catch(InputMismatchException e){
					System.out.println("Salary could not be set.");
				}
				System.out.println("Section:");
				scanner.nextLine();//debug
				rd.setSection(scanner.nextLine());
				System.out.println("Team:");
				rd.setTeam(scanner.nextLine());
				System.out.println("Programming Languages: (Type languages separated by commas. Example: Java, C, ... . If none, type 'None'.");
				String aux = scanner.next();
				rd.setLanguages(aux.split(","));
				
				return rd;
			case "4":
				JuniorDev jd = new JuniorDev();
				System.out.println("First Name:");
				jd.setFirstName(scanner.next());
				scanner.nextLine(); //debug
				System.out.println("Last Name:");
				jd.setLastName(scanner.nextLine());
				System.out.println("Phone Number:");
				jd.setPhone(scanner.nextLine());
				System.out.println("Adress:");
				jd.setAddress(scanner.nextLine());
				System.out.println("Salary: (Please enter a number)");
				try {
					jd.setSalary(scanner.nextDouble());
				}
				catch(InputMismatchException e){
					System.out.println("Salary could not be set.");
				}
				System.out.println("Section:");
				scanner.nextLine();//debug
				jd.setSection(scanner.nextLine());
				System.out.println("Team:");
				jd.setTeam(scanner.nextLine());
				System.out.println("Programming Languages: (Type languages separated by commas. Example: Java, C, ... . If none, type 'None'");
				String aux2 = scanner.next();
				jd.setLanguages(aux2.split(","));
				return jd;
			default:
				return null;
		}
	}

	public int handleEmployeeEdit() {
		System.out.println("Which employee?");
		int index = scanner.nextInt();
		return index-1;
	}
	
	public int handleEmployeeRemove() {
		System.out.println("Which employee?");
		int index = scanner.nextInt();
		return index-1;
	}
	
	//one specific employee
	public int handleEmployeeList(Vector<Employee> employees) {
		System.out.println("Which employee?");
		int index = scanner.nextInt();
		return index-1;
		
	}
	
	//all employees
	public void handleEmployeesList(Vector<Employee> employees) {
		if(employees.size()==0) System.out.println("No employees registered yet.");
		else {
			for (Employee e : employees) {
				System.out.println(employees.indexOf(e)+1 + ". " + e.getFirstName());
			}
		}
	}
}
