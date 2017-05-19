package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techelevator.Card.Rank;
import com.techelevator.Card.Suit;

public class DeckOfCards {
	private List<Card> cards = new ArrayList<Card>();
	
	public DeckOfCards(){
		for(Suit suit : Suit.values()){
			for(Rank rank : Rank.values()){
				cards.add(new Card(suit, rank));
			}
		}
	}
	

	public void printDeck(){
		for(Card card : cards){
			System.out.println(card);
		}
	}
	
	public void shuffle(){
		Collections.shuffle(cards);
	}
	
	public List<Card> dealCards(int handSize){
		List<Card> hand = new ArrayList<Card>();
		for(int i = 0; i < handSize; i++){
			hand.add(cards.get(0));
			cards.remove(0);
		}
		return hand;
	}
}
