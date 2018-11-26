package com.qa.business.service;

import com.qa.domain.Account;

public class PrizeGenerator implements IPrizeGenerator {

	@Override
	public String generatePrize(Account account) {
		if (account.getAccountNumber().charAt(0) == 'A' && account.getAccountNumber().length() == 7) {
			return "You have won £25";
		} else if (account.getAccountNumber().charAt(0) == 'B' && account.getAccountNumber().length() == 7) {
			return "You have won £50";
		} else if (account.getAccountNumber().charAt(0) == 'A' && account.getAccountNumber().length() == 9) {
			return "You have won £100";
		} else if (account.getAccountNumber().charAt(0) == 'B' && account.getAccountNumber().length() == 9) {
			return "You have won £200";
		} else if (account.getAccountNumber().charAt(0) == 'A' && account.getAccountNumber().length() == 11) {
			return "You have won £400";
		} else if (account.getAccountNumber().charAt(0) == 'B' && account.getAccountNumber().length() == 11) {
			return "You have won £800";
		} else if (account.getAccountNumber().charAt(0) == 'C') {
			return "You have lost";
		}
		return null;
	}

}
