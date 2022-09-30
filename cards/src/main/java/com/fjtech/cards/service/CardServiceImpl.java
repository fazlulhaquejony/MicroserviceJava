package com.fjtech.cards.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fjtech.cards.model.Cards;

@Service
@Transactional
public class CardServiceImpl implements CardService {

	@Autowired
	public CardService cardService;
	@Override
	public Cards getdata() {
		Cards card = cardService.getdata();
		return card;
	}

}
