class Person{
	Name name;
	Date dateOfBirth;
	static int numPerson = 0;
	
	Person(String firstName, String lastName, int day, int month, int year){
		name = new Name(firstName,lastName);
		dateOfBirth = new Date(day,month,year);
		numPerson ++;
	}
	void printInfo() {
		System.out.print("Name: ");
		name.printName();
		System.out.print("DOB: ");
		dateOfBirth.printDate();
		printAgeAtYear(dateOfBirth.year);
		
	}
	void printAgeAtYear(int year) {
		int age = 2021 - year;
		System.out.print("Age: ");
		System.out.println(age);
	}
	static void printNumberOfPerson() {
		System.out.println("The total number of Persons is " + numPerson + " persons.");
	}

}