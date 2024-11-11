
public class SavingsAccount extends BankAccount {
private double rate = 0.025;
private int savingsNumber = 0;
private String accountNumber;

public SavingsAccount(String accountHolder, double initialBalance) {
	//  initialize accountNumber to be the current value with a hyphen
	super(accountHolder, initialBalance);
	this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
}



public void postInterest(){
	double monthlyInterest = getBalance() * (rate / 12);
	 deposit(monthlyInterest);
}

@Override
public String getAccountNumber() {
	return this.accountNumber;
}
public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
	super(originalAccount, initialBalance);
    this.savingsNumber = originalAccount.savingsNumber + 1;
    this.accountNumber = super.getAccountNumber() + "-" + (this.savingsNumber);
}

}
