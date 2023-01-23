//define TaxPayer to be an interface
public interface TaxPayer {
   //add abstract methods to this interface
	public abstract double calculateYearlyIncome( );
	
	public abstract double calculateTax( );
	
	public abstract void payTax( );
  
}