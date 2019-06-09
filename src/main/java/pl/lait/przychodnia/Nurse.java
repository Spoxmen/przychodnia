package pl.lait.przychodnia;

public class Nurse extends Employee{
	
	int overtime;
	
	public Nurse(String fName, String lName, String gender, int salary, int overtime) {
		super(fName, lName, gender, salary);
		this.overtime = overtime;
	}
		
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int newValue) {
		this.overtime = newValue;
	}
	
}
