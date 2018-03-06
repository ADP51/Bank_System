/*
 * Student Name: Andrew Palmer
 * Course Number: CST8132
 * Section: 311
 * File Name: SavingsAccount.java
 */

package lab4;

/**
 * This is a type of BankAccount and inherits everything from BankAccount
 * 
 * @author Andrew Palmer
 * @version 1.0
 */

public class SavingsAccount extends BankAccount {

	private double annualInterestRate;

	/**
	 * The constructor for savingsAccounts
	 * @param bal is used to initialize balance for the account           
	 */
	SavingsAccount(double bal) {
		super(bal);
		annualInterestRate = 0.3;
	}

	/**
	 * Calculates and adds the interest back into the account.
	 */
	public void calculateAndUpdateBalance() {
		double interest = this.balance * (annualInterestRate / 12);
		this.balance += interest;
	}
}
