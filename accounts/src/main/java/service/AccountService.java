package service;

import org.springframework.stereotype.Service;

import model.Accounts;

@Service
public interface AccountService {
	
	public Accounts getDataByAccountNumber();

}
