package utils;

public class Program {
	
	private int accountNumber;
	private String accountName;
	private double setAccountValue;
	private double accountDeposit;
	private double accountWithdraw;
	
//	CONSTRUCTOR
	public Program() {
	}
	
public Program(int accountNumber, String accountName, double setAccountValue, double accountDeposit,
		double accountWithdraw) {
	super();
	this.accountNumber = accountNumber;
	this.accountName = accountName;
	this.setAccountValue = setAccountValue;
	this.accountDeposit = accountDeposit;
	this.accountWithdraw = accountWithdraw;
}

//	GETTER AND SETTER
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountInicialDeposit() {
		return setAccountValue;
	}
	
	public void setAccountValue(double setAccountValue) {
		this.setAccountValue = setAccountValue;
	}
	
	public double getAccountDeposit() {
		return accountDeposit;
	}
	
	public void setAccountDeposit(double accountDepoist) {
		this.accountDeposit = accountDepoist;
	}
	
	public double getAccountWithdraw() {
		return accountWithdraw;
	}
	
	public void setAccountWithdraw(double accountWithdraw) {
		this.accountWithdraw = accountWithdraw;
	}
	
//	FUNCTIONS
	public double AccountDepositValue() {
		return this.setAccountValue + accountDeposit;
	}
	
	public double AccountWithdrawValue() {
		return AccountDepositValue() - accountWithdraw - 5;
	}
	
	
	
	
	
	

}
