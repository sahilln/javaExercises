package com.techelevator;

import java.util.List;

public class Main {
	public static void main(String[] args){
		DeckOfCards myDeck = new DeckOfCards();
		
		myDeck.shuffle();
		
		List<Card> player1 = myDeck.dealCards(5);
		List<Card> player2 = myDeck.dealCards(5);
		
		System.out.println("Player 1");
		for(Card card: player1){
			System.out.println(card);
		}
		
		System.out.println("\nPlayer2");
		for(Card card : player2){
			System.out.println(card);
		}
	}
}
