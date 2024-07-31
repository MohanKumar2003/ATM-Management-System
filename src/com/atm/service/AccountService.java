package com.atm.service;

import com.atm.AppRunner;
import com.atm.accounts.AccountHolder;
import com.atm.database.UserDatabase;
import com.atm.util.Print;
import com.atm.util.Scan;

public class AccountService extends UserDatabase {

	/** All Accounts Creation Method */
	public void createAccount(String accountType, double balance) {
		
		String 
			fullName = null,
			address = null;
		
		long 
			aadharNumber = 0, 
			mobileNumber = 0;

		System.out.println("""
		------------------------------------------
			Enter Your Details
		------------------------------------------""");
		// user to enter values
		// full name
		System.out.print("Full Name : ");
		fullName = Scan.userGivingString();
		
		// Aadhar No
		System.out.print("Aadhar No : ");
		aadharNumber = Scan.userGivingLong();
		
		// Mobile No
		System.out.print("Mobile No : ");
		mobileNumber = Scan.userGivingLong();
		
		// Address
		System.out.print("Address : ");
		address = Scan.userGivingString();

		// checking for user is already exist or not
		if (userIsExistOrNot(aadharNumber)) {
			// auto generate account no
			int accountNumber = AppRunner.generateAccountNumber();
			
			// account holder object Creation.
			AccountHolder accountHolder = new AccountHolder(
				accountNumber, 
				accountType, 
				fullName, 
				aadharNumber, 
				mobileNumber, 
				address, 
				balance);
			
			// adding user to database
			addUser(accountNumber, accountHolder);

			// print all details of user by getting database
			Print.User.fullDetails(getUser(accountNumber));	
		} else {
			System.out.println("---------You Have Already An Account !----------");
		}
	}
}
