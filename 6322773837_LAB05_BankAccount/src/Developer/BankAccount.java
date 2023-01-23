package Developer;

public class BankAccount {
	//Exercise 4: add properties 
	private String ownerName;
	String accountNumber;
	private double balance;
	public int numAccount = 0;

	public BankAccount(String ownerName, String accountNumber, double balance) {
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		numAccount++;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit: $" + amount);
	}

	protected void withdraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
			System.out.println("Withdraw: $" + amount);
		} else {
			System.out.println("Not enough balance!");
		}
		
	}

	void printInffo(){
		System.out.println(ownerName + "\t" + accountNumber + "\t" + balance);
	}
	
	// Exercise 4-b-1: access the encapsulated variables
	public double getBalance() {
		//Exercise 5-b-2 and 5-a-2
		return balance;
	}
	public void getWithdraw(double amount) {
		//Exercise 5-b-3
		withdraw(amount);
	}	
	
}

