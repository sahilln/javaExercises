package com.techelevator;

public class FruitTree {
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	private int startingPiecesOfFruit;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
		this.typeOfFruit = typeOfFruit;
		this.startingPiecesOfFruit = startingPiecesOfFruit;
	}
	
	public String getTypeOfFruit(){
		return typeOfFruit;
	}
	
	public int getPiecesOfFruitLeft(){
		return piecesOfFruitLeft;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove){
		if(piecesOfFruitLeft < 1){
			return false;
		}
		else{
			return true;
		}
	}
}
