package employee;

public class Employeetest {
	public static void main(String[] args) {
		Employee Ash = new Employee(null, null, 003, 0);
		Ash.setfirstName("Ash");
		Ash.setlastName("Ketchum");
		Ash.employeeSummary();

		Employee Billie = new Manager(null, null, 005, 0, "departmentA");
		Billie.setfirstName("Billie");
		Billie.setlastName("Eilish");
		Billie.employeeSummary();
	}

}
