package com.fjtech.loans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fjtech.loans.models.Loan;
import com.fjtech.loans.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	@GetMapping("/getdata")
	private Loan getData()
	{
		return loanService.getData();
	}
	
	

}
