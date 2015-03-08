package com.ufokechukwu.poker.evaluator;

public class Card {
	
	private String cardValue; // 5Spade = 5S
	private String cardSuit;  // Type of card, SPADE, HEART, DIAMOND, CLUB, 
	private int cardRank;   // Ranks card with number between 14 and 2


	public String getCardValue() {
		return cardValue;
	}
	
	
	
	public void setCardValue(String cardValue) {
		this.cardValue = cardValue;
	}
	
	
	public String getCardSuit() {

		if (cardValue.charAt(1) == 'S')
			this.cardSuit = "SPADE";
		
		if (cardValue.charAt(1) == 'H')
			this.cardSuit = "HEARTS";
		
		if (cardValue.charAt(1) == 'D')
			this.cardSuit = "DIAMOND";
		
		if (cardValue.charAt(1) == 'C')
			this.cardSuit = "CLUB";	
			
			return cardSuit;
	}
	
	
	public int getCardRank() {
		
		if (cardValue.charAt(0) == 'A')
			this.cardRank = 14;
		
		if (cardValue.charAt(0) == 'K')
			this.cardRank = 13;
		
		if (cardValue.charAt(0) == 'Q')
			this.cardRank = 12;
		
		if (cardValue.charAt(0) == 'J')
			this.cardRank = 11;	
		
		if (cardValue.charAt(0) == 'T')
			this.cardRank = 10;
		
		if (cardValue.charAt(0) == '9')
			this.cardRank = 9;
		
		if (cardValue.charAt(0) == '8')
			this.cardRank = 8;
		
		if (cardValue.charAt(0) == '7')
			this.cardRank = 7;	
		
		if (cardValue.charAt(0) == '6')
			this.cardRank = 6;	
		
		if (cardValue.charAt(0) == '5')
			this.cardRank = 5;
		
		if (cardValue.charAt(0) == '4')
			this.cardRank = 4;
		
		if (cardValue.charAt(0) == '3')
			this.cardRank = 3;
		
		if (cardValue.charAt(0) == '2')
			this.cardRank = 2;	
		
		return cardRank;
	}
	
	
	
	
	

}
