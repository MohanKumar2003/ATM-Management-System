package com.atm.accounts;

import com.atm.AppRunner;
import com.atm.service.AccountService;
import com.atm.util.Print;
import com.atm.util.Scan;

class ZeroAccount implements CreateAccount {
		
	@Override
	public void fillAllDetails() {
		// default values of Zero Account
		String accountType = "Zero Account";
		double balance = 100;

		AccountService accountService = new AccountService();
		accountService.createAccount(accountType, balance);
	}
}

class SavingsAccount implements CreateAccount {

	@Override
	public void fillAllDetails() {
		
		// default values of savings Account
		String accountType = "Savings Account";
		double balance = 1000;

		AccountService accountService = new AccountService();
		accountService.createAccount(accountType, balance);
	}
}

class CurrentAccount implements CreateAccount {

	@Override
	public void fillAllDetails() {
		// default values of current Account
		String accountType = "Current Account";
		double balance = 10000;

		AccountService accountService = new AccountService();
		accountService.createAccount(accountType, balance);
	}
}

// Open new Account
public class OpenNewAccount {

	public OpenNewAccount() {
		CreateAccount createAccount = null;
		Print.Menu.openNewAccountOptions();
		switch (Scan.userGivingCharacter()) {
			case "1":
				createAccount = new ZeroAccount(); 
				createAccount.fillAllDetails();
				break;
			case "2":
				createAccount = new SavingsAccount(); 
				createAccount.fillAllDetails();
				break;
			case "3":
				createAccount = new CurrentAccount(); 
				createAccount.fillAllDetails();
				break;
			case "m":
				new AppRunner(); break;
			case "e":
				System.out.println("Exited");
				AppRunner.appRunningStatus = false;
				break;
			default:
				System.out.println("You Are Enter Invalid Option");
				break;
		}
	}
}
