package com.qa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class accountNumberGenerator implements IAccountService{
	private static List<String> accountList = new ArrayList<String>();
	private static String accountNumber = " ";
	private static int givenNumber = 100000;

	public void generateAccountNum(int givenNumber) {
		Random rand = new Random();
		int num = rand.nextInt(givenNumber * 9) + givenNumber;

		int letterNum = rand.nextInt(3);
		String letter;
		switch (letterNum) {
		case 0:
			letter = "A";
			break;
		case 1:
			letter = "B";
			break;
		case 2:
			letter = "C";
			break;
		default:
			letter = "Invalid number";
			break;
		}

		if (givenNumber > 10000000) {
			int num2 = rand.nextInt(3);
			accountNumber = letter + num + num2;
		} else {

			accountNumber = letter + num;
		}

		for (String str : accountList) {
			if (str.trim().contains(accountNumber))
				System.out.println("Account Exists");
		}
		accountList.add(accountNumber);
		System.out.println("Account added");
	}

}
