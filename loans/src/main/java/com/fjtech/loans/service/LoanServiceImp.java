package com.fjtech.loans.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fjtech.loans.models.Loan;
import com.fjtech.loans.repository.LoanRepo;

@Service
@Transactional
public class LoanServiceImp implements LoanService {

	@Autowired
	LoanRepo loanRepo;
	@Override
	public Loan getData() {
		// TODO Auto-generated method stub
		return loanRepo.getData();
	}

	
}
