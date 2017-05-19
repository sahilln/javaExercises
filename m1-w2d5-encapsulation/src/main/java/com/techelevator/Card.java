package com.techelevator;

public class Card {
	public enum Suit{
		HEARTS,
		DIAMONDS,
		SPADES,
		CLUBS
	}
	
	public enum Rank{
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING
	}
	
	private final Suit suit;
	private final Rank rank;
	
	public Card(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
	}
	
	public Suit getSuit(){
		return suit;
	}
	
	public Rank getRank(){
		return rank;
	}
	
	@Override
	public String toString(){
		return rank.toString() + " of" + suit.toString();
	}
}
