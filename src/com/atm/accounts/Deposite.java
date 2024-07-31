package com.atm.accounts;

import com.atm.database.UserDatabase;
import com.atm.util.Print;
import com.atm.util.Scan;

public class Deposite extends UserDatabase implements ATMOperation {
	
	private AccountHolder accountHolder;

	@Override
	public void fillDetails() {

		int accountNumber = 0;
		String holderName = null;
		double depositAmount = 0;
		
		System.out.println("""
		-------------------------------------
			Enter Your Details
		-------------------------------------""");
		// enter account number
		System.out.print("Account Number : ");
		accountNumber = Scan.userGivingInteger();

		// enter account holder name
		System.out.print("Holder Name : ");
		holderName = Scan.userGivingString();

		try {
			// get by account no to the database and returning to account holder object
			accountHolder = getUser(accountNumber);
			if (accountHolder == null) {
				throw new NullPointerException();
			}
			// checking the account holder name to user given name
			else if (accountHolder.fullName.equals(holderName)) {
				// Enter the deposit amount 
				System.out.print("Enter Deposit Amount : ");
				// user enter deposit amount 
				depositAmount = Scan.userGivingInteger();
				// get present balance and adding deposit amount
				double balance = (depositAmount + accountHolder.getBalance());
				// assign to account holder balance
				accountHolder.setBalance(balance);
				// adding to database
				addUser(accountNumber, accountHolder);
				Print.User.depositDetails(accountHolder, depositAmount);
			} else {
				// In above condition is false 
				// the user is not found
				System.err.println("Invalid User Account Name");
			}
		} catch (NullPointerException nullPointerException) {
			System.err.println("Invalid Account Number");
		}		
	}
}
