package com.qa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.business.service.IAccountService;
import com.qa.business.service.accountNumberGenerator;

public class Application {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IAccountService service = appContext.getBean("accountService", accountNumberGenerator.class);
	}
}