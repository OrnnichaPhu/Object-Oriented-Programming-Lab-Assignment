public class Executive extends Employee{
	double bonus;
	Executive(String firstName, String lastName, int day, int month, int year,String workplace,	String position,double Salary, double bonus){
		super(firstName,lastName,day,month,year,workplace,position,Salary);
		this.bonus = bonus;
	}
	void printInfo() {
		super.printInfo();
		System.out.println("Bonus: " + bonus);
	}
	void announceRule(String rule) {
		System.out.println("Position: " + position);
		System.out.println("Announces Rule: " + rule);
	}
}