package com.atm.database;

import java.util.HashMap;
import java.util.Map;

import com.atm.accounts.AccountHolder;

public interface Database {

	Map<Integer,AccountHolder> userDB = new HashMap<>();
	void addUser(int accountNumber, AccountHolder accountHolder);
	AccountHolder getUser(int accountNumber);
		
}
