package com.bigtreetc.tech.service.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

@Component
public class LotteryLogic<T> {
	
	private List<T> itemList;
	
	public LotteryLogic(){
		itemList = new ArrayList<>();
	}
	
	public T lottery(){
		return itemList.get(lotteryRandom());
	}
	
	public void addItem(T item,int count){
		IntStream.range(itemList.size(), itemList.size()+count+1).forEach(i -> itemList.add(i,item));
	}
	
	private int lotteryRandom(){
		Random rnd = new Random();
		
		return rnd.nextInt(itemList.size());
	}
	
	
	
	

}
