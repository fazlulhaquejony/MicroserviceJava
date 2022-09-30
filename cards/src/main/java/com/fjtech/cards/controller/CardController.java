package com.fjtech.cards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fjtech.cards.model.Cards;
import com.fjtech.cards.service.CardService;

@RestController
@RequestMapping("/card")
public class CardController {
	
	@Autowired
	public CardService cardService;
	
	@GetMapping("/getData")
	public Cards getData()
	{
		return cardService.getdata();
	}

}
