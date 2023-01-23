public class CEO extends Executive {
	String positionVehicle;
	
	CEO(String firstName, String lastName, int day, int month, int year,String workplace,	String position,double Salary, double bonus,String positionVehicle){
		super(firstName,lastName,day,month,year,workplace,position,Salary,bonus);
		this.positionVehicle = positionVehicle;
	}
	void printInfo() {
		super.printInfo();
		System.out.println("PositionVehicle: " + positionVehicle);
	}
	void showVision(String vision) {
		System.out.println(name.firstName + name.lastName + " show " + vision);
	}
}