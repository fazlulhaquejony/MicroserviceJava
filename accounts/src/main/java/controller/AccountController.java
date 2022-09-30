package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Accounts;
import service.AccountService;

@RestController("/myAccount")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping("/getaccount")
	public Accounts getAccount()
	{
		Accounts account = accountService.getDataByAccountNumber();
		//Accounts account = 
		return account;
	}
}
