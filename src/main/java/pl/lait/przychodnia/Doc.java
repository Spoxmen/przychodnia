package pl.lait.przychodnia;

public class Doc extends Employee{
	
	private int premia;
	
	public Doc(String fName, String lName, String gender, int salary, int bonus) {
		super(fName, lName, gender, salary);
		this.premia = bonus;
	}

	public void setBonus(int newBonusAmount) {
		this.premia = newBonusAmount;
	}
	public int getBonus() {
		return this.premia;
	}
	
}
