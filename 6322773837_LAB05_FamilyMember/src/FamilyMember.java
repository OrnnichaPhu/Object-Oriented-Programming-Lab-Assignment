//Exercise 1: Write a FamilyMember class of which its details (2 points)
public class FamilyMember {
	//Exercise 1: add properties 
	static String familyName = "Hilton";
	String firstName;
	static double commonFund = 100000.00;
	double privateFund;
	
	//Exercise 1: add constructor
	FamilyMember(String firstName,double privateFund){
		this.firstName = firstName;
		this.privateFund = privateFund;
	}
	
	//Exercise 1: add method
	void privateFund() {
		System.out.println(firstName +" "+familyName +" has $" + privateFund);
	}
	void contributeToCommonFund(double amount) {
		commonFund = commonFund+ amount;
		privateFund = privateFund- amount;
	}
	static void payFromCommonFund(double amount) {
		commonFund = commonFund - amount;
	}

	
	//Exercise 3-b: add two additional methods
	static void printFamilyFund() {
		System.out.println("the " + familyName +"family has $"+ commonFund);
	}
	

	
	//Exercise 3-c: print the updated common fund of the family.

}