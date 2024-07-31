package com.atm.util;

import java.util.Scanner;

public class Scan {

	private static int valueInteger;
	private static long valueDouble;
	static Scanner scanner = new Scanner(System.in);

	// String Scanner
	public static String userGivingString() {
		String valueString = scanner.nextLine().toLowerCase();
		return valueString;
	}

	// Char Scanner
	public static String userGivingCharacter() {
		String charValue = Character.toString(scanner.nextLine().toLowerCase().charAt(0));
		return charValue;
	}

	// Long Scanner
	public static long userGivingLong() {
		try {
			valueDouble = Long.parseLong(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("You Are Enter Correct Type Data");
			userGivingLong();
		}
		return valueDouble;
	}
	
	// Integer Scanner
	public static int userGivingInteger() {
	try {
			valueInteger = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("You Are Enter Correct Type Data");
			userGivingInteger();
		}
		return valueInteger;
	}
}
