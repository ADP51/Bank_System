/*
 * Student Name: Andrew Palmer
 * Course Number: CST8132
 * Section: 311
 * File Name: ChequingAccount.java
 */


package lab4;

/**
 * This is a type of BankAccount and inherits everything from BankAccount
 * 
 * @author Andrew Palmer
 * @version 1.0
 */
public class ChequingAccount extends BankAccount {

	private double monthlyFee;

	/**
	 * The constructor for chequingAccounts sets balance and monthly fees
	 * @param bal is the opening balance for these accounts
	 */
	ChequingAccount(double bal) {
		super(bal);
		monthlyFee = 5.0;
	}

	/**
	 * Takes out the monthly fee from the chequingAccount it is called on.
	 */
	public void calculateAndUpdateBalance() {
		this.balance -= monthlyFee;
	}
}
