package com.atm.accounts;

public class AccountHolder {
	
	private int accountNumber;
	private String accountType;
	public String fullName;
	private long aadharNumber;
	private long mobileNumber;
	private String address;
	private double balance;
	
	public AccountHolder() {}

	public AccountHolder(int accountNumber, String accountType, String fullName, long aadharNumber, long mobileNumber,
			String address, double balance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.fullName = fullName;
		this.aadharNumber = aadharNumber;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountHolder [accountNumber=" + accountNumber + ", accountType=" + accountType + ", fullName="
				+ fullName + ", aadharNumber=" + aadharNumber + ", mobileNumber=" + mobileNumber + ", address="
				+ address + ", balance=" + balance + "]";
	}
	
}
