package com.fjtech.cards.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cards {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="card_id")
	private long cardId;
	@Column(name="customer_id")
	private long customerId;
	@Column(name="card_number")
	private int cardNumber;
	@Column(name="card_type")
	private int cardType;
	@Column(name="total_limit")
	private int totalLimit;
	@Column(name="ammount_used")
	private int amountUsed;
	@Column(name="available_amount")
	private int availableAmount;
	@Column(name="create_dt")
	private Date creteDt;
}
