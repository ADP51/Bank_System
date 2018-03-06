/*
 * Student Name: Andrew Palmer
 * Course Number: CST8132
 * Section: 311
 * File Name: BankAccount.java
 */


package lab4;

/**
 * Is an abstract class of BankAccounts that all account type s inherit from
 * 
 * @author Andrew Palmer
 * @version 1.0
 */
public abstract class BankAccount {

	/**
	 * Works as a balance for each account
	 */
	protected double balance;
	
	/**
	 * Constructor for BankAccount class initializes balance
	 * @param balance Initial balance
	 */
	public BankAccount(double balance) {
		this.balance = balance;
	}

	/**
	 * Returns the balance of the account it is called on
	 * 
	 * @return the balance attribute
	 */
	public double getBalance() {;
		return this.balance;
	}

	/**
	 * Makes the appropriate calculation for fees and interest and adjusts the
	 * account its called on.
	 */
	public abstract void calculateAndUpdateBalance();
}
