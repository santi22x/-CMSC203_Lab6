
public class CheckingAccount extends BankAccount {
	private static final double FEE = 0.15;
	
	public CheckingAccount(String accountHolder, double initialAmount) {
		super(accountHolder, initialAmount);
		// initializes accountNumber to be the current value in accountNumber concatenated with –10 
		setAccountNumber(getAccountNumber() + "-10");
	}
	@Override
	public boolean withdraw(double amount) {
		boolean completed = true;
		double clearingOkay = amount + FEE;
		if(getBalance() >= clearingOkay){
			super.withdraw(clearingOkay);
			return completed;
		}else {
			completed = false;
	        return completed;
		}
	}
}
