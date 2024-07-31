package com.atm.database;

import java.util.Collection;

import com.atm.accounts.AccountHolder;
import com.atm.util.Print;

public class UserDatabase implements Database {

	/** User is exist or not method
	 * return true or false, if user is exist then return 'false' or else 'true'
	 */
	public boolean userIsExistOrNot(long aadharNo) {
		// return variable, true means - no any user, false means - user is exist
		boolean userIsExistOrNot = true;
		Collection<AccountHolder> listOfAccountHolders = userDB.values();
		for (AccountHolder accountHolder : listOfAccountHolders) {
			userIsExistOrNot = (accountHolder.getAadharNumber() != aadharNo) ? true : false;
		}
		return userIsExistOrNot;
	}

	/** get and print all user data */
	public void getAllUser() {
		Collection<AccountHolder> collection = userDB.values();
		for (AccountHolder accountHolder : collection) {
			Print.User.usersFullDetails(accountHolder);
		}
	}

	@Override
	public void addUser(int accountNumber, AccountHolder accountHolder) {
		userDB.put(accountNumber, accountHolder);
	}

	@Override
	public AccountHolder getUser(int accountNumber) {
		return userDB.get(accountNumber);
	}
}