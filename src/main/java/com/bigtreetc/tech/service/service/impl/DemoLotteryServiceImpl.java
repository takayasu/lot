package com.bigtreetc.tech.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bigtreetc.tech.service.domain.Card;
import com.bigtreetc.tech.service.domain.LotteryLogic;
import com.bigtreetc.tech.service.service.ILotteryService;

@Component(value="demoService")
public class DemoLotteryServiceImpl implements ILotteryService<Card>{
	
	private LotteryLogic<Card> lotteryLogic;
	
	public DemoLotteryServiceImpl(LotteryLogic<Card> _logic){
		lotteryLogic = _logic;
		lotteryLogic.addItem(new Card("S","レアなカード","1.jpg"), 10);
		lotteryLogic.addItem(new Card("A","まあまあなカード","2.jpg"), 15);
		lotteryLogic.addItem(new Card("B","普通のカード","3.jpg"), 30);
		lotteryLogic.addItem(new Card("C","雑魚のカード","4.jpg"), 45);
	}
	

	@Override
	public Card lottery() {
		return lotteryLogic.lottery();
	}


}
