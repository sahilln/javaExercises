package com.techelevator; 

	public class FruitTree { 
		private String typeOfFruit; 
		private int piecesOfFruitLeft; 

		public String getTypeOfFruit(){ 
			return typeOfFruit; 
		} 
	
		public int getPiecesOfFruitLeft(){ 
			return piecesOfFruitLeft; 
		} 

		public boolean pickFruit(int numberOfPiecesToRemove){ 
			
			if(numberOfPiecesToRemove > 0 && this.piecesOfFruitLeft > 0){ 
				this.piecesOfFruitLeft -=numberOfPiecesToRemove; 
				return true; 
			} 
			
			return false; 
		} 
		
		public FruitTree(String typeOfFruit, int startingPiecesOfFruit){ 
			this.typeOfFruit = typeOfFruit; this.piecesOfFruitLeft = startingPiecesOfFruit; 
		} 
	}


