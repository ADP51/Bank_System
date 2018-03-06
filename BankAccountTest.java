/*
 * Student Name: Andrew Palmer
 * Course Number: CST8132
 * Section: 311
 * File Name: ChequingAccount.java
 */

package lab4;

/**
 * This class is to run fee withdrawal and interest deposits for all accounts over 12 months.
 * @author Andrew Palmer
 * @version 1.0
 */
public class BankAccountTest {

	private BankAccount[] accounts;

	/**
	 * A constructor for BankAccountTest creates accounts and places them into
	 * accounts[]
	 */
	BankAccountTest() {
		
		//initialize array
		accounts = new BankAccount[4];
		
		accounts[0] = new ChequingAccount(Math.random() * 100 + 1);
		accounts[1] = new ChequingAccount(Math.random() * 100 + 1);
		accounts[2] = new SavingsAccount(Math.random() * 100 + 1);
		accounts[3] = new SavingsAccount(Math.random() * 100 + 1);
	}

	/**
	 * Loops through an array and runs a calculateAndUpdateBalance on every Account
	 * in the array
	 * @param accounts is an Array of BankAccounts           
	 */
	private void monthlyProcess(BankAccount[] accounts) {
		for (BankAccount b : accounts) {
			b.calculateAndUpdateBalance();
		}
	}

	/**
	 * Loops through an array and prints information about the contents
	 * @param accounts is an array of accounts          
	 */
	private void display(BankAccount[] accounts) {
		//counters to apply a number to the different accounts.
		int counter = 1;
		int counter1 = 1;
		//loop through the array accounts and print the display info and balances.
		for (int i = 0; i < accounts.length; i++) {
			if (i < 2) {
				System.out.println("Chequing Account " + counter + " balance: " + accounts[i].getBalance() + "$");
				counter++;
			} else {
				System.out.println("Savings Account " + counter1 + " balance: " + accounts[i].getBalance() + "$");
				counter1++;
			}
		}
	}

	/**
	 * Main method runs the monthlyProcess 12 times to simulate a year.
	 * @param args Command line arguments.           
	 */
	public static void main(String[] args) {
		BankAccountTest one = new BankAccountTest();
		for (int i = 0; i < 12; i++) {
			System.out.println("Month: " + (i + 1));
			System.out.println("==========");
			one.monthlyProcess(one.accounts);
			one.display(one.accounts);
			System.out.println();
		}
	}
}
