package com.qa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TenDigit {

	public static List<String> accountList = new ArrayList<String>();

	public static void main(String[] args) {
		generateAccountNum();
	}

	public static void generateAccountNum() {
		Random rand = new Random();
		int num = rand.nextInt(900000000) + 100000000;
		int num2 = rand.nextInt(9) + 1;

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

		String accountNumber = letter + num + num2;
		System.out.println(accountNumber);

		for (String str : accountList) {
			if (str.trim().contains(accountNumber))
				System.out.println("Account Exists");
		}
		accountList.add(accountNumber);
		System.out.println("Account added");
	}

}

