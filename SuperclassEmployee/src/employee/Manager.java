package employee;

class Manager extends Employee {
	public static void main(String[] args) {
		Employee Billie = new Manager(null, null, 005, 0, "departmentA");
		Billie.setFirstName("Billie");
		Billie.setLastName("Eilish");
		Billie.employeeSummary();
	}

	public String departmentA;

	public Manager(String firstName, String lastName, int employeeID, double salary, String departmentA) {
		super(firstName, lastName, employeeID, salary);
		this.departmentA = departmentA;
	}
	
	

	public void employeeSummary() {
		System.out.println("firstName: " + this.firstName);
		System.out.println("lastName:" + this.lastName);
		System.out.println("employeeID:" + this.employeeID);
		System.out.println("salary:" + this.salary);
		System.out.println("departmentA:" + this.departmentA);
	}

	public String getDepartmentA() {
		return departmentA;
	}

	public void setDepartmentA(String departmentA) {
		this.departmentA = departmentA;
	}
	
	

}
