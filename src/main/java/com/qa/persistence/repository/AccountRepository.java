package com.qa.persistence.repository;

import java.util.List;

import com.qa.domain.Account;

public interface AccountRepository {
	
	public List<Account> findAll();
	
	public String createAccount(String firstName, String lastName);
}
