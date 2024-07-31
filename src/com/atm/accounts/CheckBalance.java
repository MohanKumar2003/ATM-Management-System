package com.atm.accounts;

import com.atm.database.UserDatabase;
import com.atm.util.Print;
import com.atm.util.Scan;

public class CheckBalance extends UserDatabase implements ATMOperation {
	
	private AccountHolder accountHolder;

	@Override
	public void fillDetails() {

		int accountNumber = 0;
		String holderName = null;
				
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
				// print the user balance
				Print.User.checkBalanceDetails(accountHolder);				
			} else {
				// In above condition is false 
				// the user is not found
				System.out.println("Invalid User Account Name");
			}
		} catch (NullPointerException nullPointerException) {
			System.out.println("Invalid Account Number");
		}		
	}
}
