package com.atm;

import com.atm.accounts.ATMOperation;
import com.atm.accounts.CheckBalance;
import com.atm.accounts.Deposite;
import com.atm.accounts.OpenNewAccount;
import com.atm.accounts.Withdraw;
import com.atm.database.UserDatabase;
import com.atm.util.Print;
import com.atm.util.Scan;

public class AppRunner {

	private static int accountNumber = 1001000;
	public static boolean appRunningStatus = true;
	
	public AppRunner() {
		
		while (appRunningStatus) {
			ATMOperation bankOperation = null;
			Print.Menu.welcomeMenu();
			switch (Scan.userGivingCharacter()) {
				case "1":
					new OpenNewAccount();
					break;
				case "2":
					bankOperation = new Deposite();
					bankOperation.fillDetails();
					break;
				case "3":
					bankOperation = new Withdraw();
					bankOperation.fillDetails();
					break;
				case "4":
					bankOperation = new CheckBalance();
					bankOperation.fillDetails();
					break;				
				case "e":
					System.out.println("Exited");
					appRunningStatus = false;
					break;
				case "a":
					UserDatabase userDatabase = new UserDatabase();
					userDatabase.getAllUser();
					break;
				default:
					System.out.println("You Are Enter Invalid Option");
					break;
			}
		}
	}

	/** Account Number generator */
	public static int generateAccountNumber() {
		accountNumber = accountNumber + 1;
		return accountNumber;
	}
}
