package com.qa.persistence.repository;

import java.util.ArrayList;
import java.util.List;

import com.qa.domain.Account;

public class HibernateAccountRepositoryImpl implements AccountRepository {

	List<Account> customers = new ArrayList<>();
	
	public List<Account> findAll() {
	
		return customers;
	}

	
	public String createAccount(String firstName, String lastName) {
		Account account = new Account();
		
		account.setFirstName(firstName);
		account.setLastName(lastName);
		
		customers.add(account);
		
		return "Account successfully created";
	}

}
