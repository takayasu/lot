package com.bigtreetc.tech.service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bigtreetc.tech.service.domain.Card;
import com.bigtreetc.tech.service.service.ILotteryService;

@RestController
@RequestMapping("/lot")
public class LotteryController {
	
	@Qualifier("demoService")
	@Autowired
	private ILotteryService<Card> lotteryService;
	
	@RequestMapping(value="draw",method={RequestMethod.GET})
	public Card draw(){
		return lotteryService.lottery();
	}

}
