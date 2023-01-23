
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("Wang","TaLu","Male","Actor", "SIIT","000-000-0000",10);
		bankAccount.printInfo();
		//
		System.out.println();
		
		bankAccount.person.name = "Ornnicha";
		bankAccount.person.surname = "Phueaksri";
		bankAccount.person.sex = "Female";
		bankAccount.printInfo();
		//
		System.out.println();
		
		bankAccount.deposit(15);
		bankAccount.printBalance();
		//
		System.out.println();
		
		bankAccount.withdraw(5);
		bankAccount.printBalance();
		//
		System.out.println();
		
		System.out.println("Balance = " + bankAccount.convertBalanceToTHB() + " million THB");
	
		

	}

}
