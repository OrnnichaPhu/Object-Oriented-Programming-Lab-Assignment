//Define PartTime to be the subclass of Employee and TaxPayer
public class PartTime extends Employee implements TaxPayer {
	String workPlace;
	int numHrPerWeek;
	double hourlyRate;

	PartTime(String name, String position, String workPlace, int numHrPerWeek, double hourlyRate) { 
		// Use super to initialize name and position
		super(name,position);
		// assign inputs workPlace, numHrPerWeek, and hourlyRate to their corresponding
		this.workPlace = workPlace;
		this.numHrPerWeek = numHrPerWeek;
		this.hourlyRate = hourlyRate;
		// Properties

	}

	// define all overridden methods from the abtract parents
	void printWorkPlace() {
		System.out.println("Work at " + workPlace);
		
	}
	double calculateMonthlyIncome( ) {
		return numHrPerWeek*hourlyRate*4;
	}
	
	
	public double calculateYearlyIncome() {
		return calculateMonthlyIncome()*12;
	}
	
	public double calculateTax( ) {
		return calculateTaxRate(calculateYearlyIncome())*calculateYearlyIncome();
	}
	
	public void payTax( ) {
		System.out.println("Pay tax $" + calculateTax());
	}
	protected void printInfo() {
		/*
		 * Print PartTime in the following format name is a position Work at work Place
		 * Yearly income is XXXXX Pay tax $XXXXX
		 */
		super.printInfo();
		printWorkPlace();
		System.out.println("Yearly income is " + calculateYearlyIncome());
		payTax();

		System.out.println("--------------------");
	}
}