package com.redhat.main;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Company {
	
	private String name;
	private Vector<Employee> employees;
	private InputHandler handler;
	
	public Company() {
		// TODO Auto-generated constructor stub
		this.name = "**No name set.**";
		employees = new Vector<Employee>();
		handler = new InputHandler();
	}
	
	public Company(String name) {
		this.name = name;
		employees = new Vector<Employee>();
		handler = new InputHandler();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * Helper methods.
	 * 
	 * Get, edit and show information about employees and manage employees on the data structure.
	 * Functions names are very straight forward.
	 * 
	 */
	
	public void addEmployee(){
		Employee e = handler.handleEmployeeCreation();
		if (e != null) {
			employees.add(e);
			System.out.println("Employee registered succesfully!");
		}else {
			System.out.println("Returning to menu.");
		}
	}
	
	public void editEmployee() {
		int index = handler.handleEmployeeEdit();
		try {
			Employee toBeEdited = employees.get(index);
			editEmployeeHelper(toBeEdited);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Employee not found.");
		}
		System.out.println("Returning to menu.");
		
	}

	/**
	 * Helper for editing employees 
	 * @param toBeEdited (interface)
	 */
	private void editEmployeeHelper(Checkable toBeEdited) {
		System.out.println("Alright, what type of employee is he/she now?");
		System.out.println("1. Manager, 2. Supervisor, 3.Regular Dev, 4.Junior Dev");
		Scanner scanner = new Scanner(System.in);
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
				
				toBeEdited = m;
				break;
				
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
				
				toBeEdited = s;
				break;
				
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
				
				toBeEdited = rd;
				break;
				
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

				toBeEdited = jd;
				break;
			default:
				break;
			}
		//scanner.close();
	}

	public void removeEmployee() {
		int index = handler.handleEmployeeRemove();
		try {
			employees.remove(index);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Employee not found.");
		}
	}
	
	public void listEmployees() {
		handler.handleEmployeesList(employees);
	}
	
	public void listEmployee() {
		int index = handler.handleEmployeeList(employees);
		try {
			employees.get(index).checkRegistry();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Could not find employee.");
		}
	}
}
