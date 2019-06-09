package pl.lait.przychodnia;

public class Employee {

	private String fName;
	private String lName;
	private String gender;
	int salary;

	public Employee() {

	}

	public Employee(String fName, String lName, String gender, int sal) {
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.salary = sal;
	}

	public String showData() {
		return fName + " " + lName + " " + salary;
	}
}
