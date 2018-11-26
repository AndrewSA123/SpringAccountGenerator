package com.qa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EightDigit {

	public static List<String> accountList = new ArrayList<String>();

	public static void main(String[] args) {
		generateAccountNum();
	}

	public static void generateAccountNum() {
		Random rand = new Random();
		int num = rand.nextInt(90000000) + 10000000;

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

		String accountNumber = letter + num;
		System.out.println(accountNumber);

		for (String str : accountList) {
			if (str.trim().contains(accountNumber))
				System.out.println("Account Exists");
		}
		accountList.add(accountNumber);
		System.out.println("Account added");
	}

}

