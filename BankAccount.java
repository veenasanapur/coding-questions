package day13;

/*Assignment-3. (Harder problem) 

● Create an enum BankName. 

● Create a constructor of the enum which takes a parameter interestRate of type double. 

● Create the enum constant -ICICI (6.3), HDFC(5.8), SBI (6.0). 

● Now in the BankAccount class of previous exercise, modify the type of bankName to enum BankName. Change constructor accordingly. 

● Modify the instantiation of a new Account accordingly. (Example: new BankAccount(12000, "Harry", BankName.SBI); 

● Print the bankName for each account. 

● Add a method which calculates total interest - calculateInterest(int numberOfYears). 
The interest will be calculated based on interest rate and available balance.
Print total interest. [ Hints: double totalInterest = bankName.interestRate* numberOfYears * accountBalance;]*/
enum BankName
{
	ICICI(6.3),
	HDFC(5.8),
	SBI(6.0);
	double interestRate;
	BankName(double interestRate)
	{
		this.interestRate = interestRate;
	}
}
public class BankAccount {
	
	double accountBalance;
	String accountHolderName;
	
	BankName bankName;
	
	public BankAccount(double accountBalance, String accountHolderName, BankName bankName) {
		
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}

    public String getAccountHolderName() {
		return accountHolderName;
	}

    public BankName getBankName() {
		return bankName;
	}

    public void deposit(double amount)
    {
    	accountBalance += amount;
    }
    public void withdraw(double amount)
    {
    	accountBalance -= amount;
    }

    public void calculateInterest(int numberOfYears)
    {
    	double totalInterest = bankName.interestRate* numberOfYears * accountBalance;
    	System.out.println(totalInterest);
    }
    public static void main(String[] args) {
		BankAccount account1 = new BankAccount(12000,"Jack",BankName.HDFC);
		account1.deposit(5000);
		System.out.println(account1.getAccountBalance());
		System.out.println(account1.bankName);
		account1.calculateInterest(10);
	}

}
