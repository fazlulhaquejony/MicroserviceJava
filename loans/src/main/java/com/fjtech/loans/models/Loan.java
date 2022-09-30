package com.fjtech.loans.models;

import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Loan {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="loan_number")
	private int loanNumber;
	@Column(name="customer_id")
	private int customerId;
	@Column(name="start_Dt")
	private Date startDt;
	@Column(name="loan_type")
	private int loanType;
	@Column(name="total_loan")
	private int totalLoan;
	@Column(name="amount_paid")
	private int amountPaid;
	@Column(name="out_standing_amount")
	private int outStandingAmount;
	@Column(name="create_dt")
	private Date createDt;
	
	

}
