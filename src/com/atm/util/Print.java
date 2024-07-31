package com.atm.util;

import com.atm.accounts.AccountHolder;

public interface Print {

	// Menu
	static class Menu {
		// welcome menu
		public static void welcomeMenu() {
			System.out.print("""
			-------------------------------------
				Welcome To Your Bank !
			-------------------------------------
			1. Open New Account
			2. Deposit
			3. Withdraw
			4. Check balance
			E. Exit
			-------------------------------------
			Enter Your Option : """);
		}

		// account opening options
		public static void openNewAccountOptions() {
			System.out.print("""
			-------------------------------------
				Opening New Account Options
			-------------------------------------
			1. Zero Account
			2. Savings Account
			3. Current Account
			M. Main Menu
			E. Exit
			-------------------------------------
			Enter Your Option : """);
		}
	}
	
	// User
	static class User {

		/** print all details form user database */
		public static void usersFullDetails(AccountHolder accountHolder) {
			System.out.println(
				"------------------------------------------" +
				"\nAccount Number : " + accountHolder.getAccountNumber() +
				"\nFull Name : " + accountHolder.getFullName() +
				"\nAccount Type : " + accountHolder.getAccountType() +
				"\nAadhar Number : " + accountHolder.getAadharNumber() +
				"\nMobile Number : " + accountHolder.getMobileNumber() +
				"\nAddress : " + accountHolder.getAddress() +
				"\nBalance : " + accountHolder.getBalance() +
				"\n"
			);
		}

		// print all details for user
		public static void fullDetails(AccountHolder accountHolder) {
			System.out.println(
				"------------------------------------------\n" +
				" Successfully Your Account is Created \n" +
				"------------------------------------------" +
				"\nAccount Number : " + accountHolder.getAccountNumber() +
				"\nFull Name : " + accountHolder.getFullName() +
				"\nAccount Type : " + accountHolder.getAccountType() +
				"\nAadhar Number : " + accountHolder.getAadharNumber() +
				"\nMobile Number : " + accountHolder.getMobileNumber() +
				"\nAddress : " + accountHolder.getAddress() +
				"\nBalance : " + accountHolder.getBalance() +
				"\n------------------------------------------"
			);
		}
		
		// print balance
		public static void checkBalanceDetails(AccountHolder accountHolder) {
			System.out.println(
				"------------------------------------------\n" +
				"	Your Account Balance Details" +
				"\n------------------------------------------" + 
				"\nAccount Number : " + accountHolder.getAccountNumber() + 
				"\nFull Name : " + accountHolder.getFullName() + 
				"\nAccount Type : " + accountHolder.getAccountType() + 
				"\nBalance : " + accountHolder.getBalance() +
				"\n------------------------------------------"
			);
		}

		// print deposit amount details
		public static void depositDetails(AccountHolder accountHolder, double depositAmount) {
			System.out.println(
				"------------------------------------------\n" +
				"	Your Deposit Amount Details" +
				"\n------------------------------------------" + 
				"\nAccount Number : " + accountHolder.getAccountNumber() + 
				"\nFull Name : " + accountHolder.getFullName() + 
				"\nAccount Type : " + accountHolder.getAccountType() + 
				"\nDeposite Amount : " + depositAmount +
				"\nTotal Balance : " + accountHolder.getBalance() +
				"\n------------------------------------------"
			);
		}
		// print withdraw amount details
		public static void withdrawDetails(AccountHolder accountHolder, double withdrawAmount) {
			System.out.println(
				"------------------------------------------\n" +
				"	Your Withdraw Amount Details" +
				"\n------------------------------------------" + 
				"\nAccount Number : " + accountHolder.getAccountNumber() + 
				"\nFull Name : " + accountHolder.getFullName() + 
				"\nAccount Type : " + accountHolder.getAccountType() + 
				"\nWithdraw Amount : " + withdrawAmount +
				"\nTotal Balance : " + accountHolder.getBalance() +
				"\n------------------------------------------"
			);
		}
	}
	
}
