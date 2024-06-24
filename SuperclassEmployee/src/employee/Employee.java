package employee;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Employee Ash = new Employee(null, null , 003 ,   0);
		Ash.setFirstName("Ash");
		Ash.setLastName("Ketchum");
		Ash.employeeSummary();
	}

	String firstName;
	String lastName;
	int employeeID;
	double salary;

	public Employee(String firstName, String lastName, int employeeID, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.salary = 0;

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

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	

	public void employeeSummary()  {
		System.out.println("firstName: " + this.firstName);
		System.out.println("lastName:" + this.lastName);
		System.out.println("employeeID:" + this.employeeID);
		System.out.println("salary:" + this.salary);

	}
}
