package com.bigtreetc.tech.service.domain;

public class Card {
	private String value;
	private String rank;
	private String image;
	
	
	public Card(String _rank,String _value,String url){
		this.rank = _rank;
		this.value = _value;
		this.image = url;
	}

	
	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	public String getRank() {
		return rank;
	}



	public void setRank(String rank) {
		this.rank = rank;
	}

	


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String toString(){
		return rank+"-"+value;
	}
}
