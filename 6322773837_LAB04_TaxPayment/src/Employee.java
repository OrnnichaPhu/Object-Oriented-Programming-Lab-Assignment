//Define Employee to be an abstract class
public abstract class Employee {
	String name;
	String position;

	public Employee(String name, String position) {
		// assign the input arguments to their corresponding properties
		this.name = name;
		this.position = position;
		
	}

	// define all abstract methods according to UML
	abstract double calculateMonthlyIncome( );
	abstract void printWorkPlace( );

	protected void printInfo() {
		System.out.println(name + " is a " + position);
		// Print info of an Employee in the format of [name] is a [position]

	}

	// This method is provided. No need to add anything.
	public double calculateTaxRate(double salary) {
		if (salary <= 200000) 		//conditions
			return 0.0;	//return tax rate
		else if (salary <= 400000)	//conditions
			return 0.05;	//return tax rate
		else if (salary <= 600000)	//conditions
			return 0.1;	//return tax rate
		else if (salary <= 800000)	//conditions
			return 0.15;	//return tax rate
		else	
			return 0.2;	//return tax rate
	}

}