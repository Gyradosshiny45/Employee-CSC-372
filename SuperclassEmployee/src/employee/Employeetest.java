package employee;

public class Employeetest {
	public static void main(String[] args) {
		Employee Ash = new Employee(null, null, 003, 0);
		Ash.setFirstName("Ash");
		Ash.setLastName("Ketchum");
		Ash.employeeSummary();

		Employee Billie = new Manager(null, null, 005, 0, "departmentA");
		Billie.setFirstName("Billie");
		Billie.setLastName("Eilish");
		Billie.employeeSummary();
	}

}
