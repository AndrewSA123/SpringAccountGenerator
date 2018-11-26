import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qa.business.service.AccountService;
import com.qa.business.service.IAccountService;
import com.qa.persistence.repository.AccountRepository;
import com.qa.persistence.repository.HibernateAccountRepositoryImpl;

@Configuration
public class AppConfig {

	@Bean(name = "accountService")
	public void accountService() {
		AccountRepository accountRepo = getAccountRepository();
		IAccountService accountService = new AccountService();
		accountRepo.setService(accountService);
	}

	@Bean(name = "accountRepository")
	public AccountRepository getAccountRepository() {
		return new HibernateAccountRepositoryImpl();
	}

}
