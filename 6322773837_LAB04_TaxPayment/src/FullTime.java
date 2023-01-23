//Define class full time to be a subclass of Employee and TaxPayer
public class FullTime extends Employee implements TaxPayer{
	double salary;
	String workPlace;

	FullTime(String name, String position, String workPlace, double salary) { 
		// Use super to initialize name and position
		super(name,position);
		// assign the input arguments to their corresponding properties
		this.salary = salary;
		this.workPlace = workPlace;

	}

	// Write by yourself all overridden methods from its parents
	void printWorkPlace() {
		System.out.println("Work at " + workPlace);
		
	}
	double calculateMonthlyIncome( ) {
		return salary;
	}
	
	
	public double calculateYearlyIncome() {
		return 12*salary;
	}
	
	public double calculateTax( ) {
		return calculateTaxRate(calculateYearlyIncome())*calculateYearlyIncome();
	}
	
	public void payTax( ) {
		System.out.println("Pay tax $" + calculateTax());
	}

	protected void printInfo() {
		/*
		 * print the FullTime in the following format name is a position Work at
		 * workPlace Yearly income is XXXXX Pay tax $XXXXX
		 */
		super.printInfo();
		printWorkPlace();
		System.out.println("Yearly income is " + calculateYearlyIncome());
		payTax();

		System.out.println("--------------------");
	}

}