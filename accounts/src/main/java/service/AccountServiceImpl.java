package service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Accounts;
import repository.AccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepository;
	@Transactional
	public Accounts getDataByAccountNumber()
	{
		Accounts account = accountRepository.getDataByAccountNumber();
		return account;
	}

}
