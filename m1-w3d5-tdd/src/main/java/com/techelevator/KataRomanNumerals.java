package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {
	
	public static String convertToRM(int number){
		Map<Integer, String>romans = new HashMap<Integer, String>();
		
		 romans.put(1000, "M");
		 romans.put(900, "CM");
		 romans.put(500, "D");
		 romans.put(400, "CD");
		 romans.put(100, "C");
		 romans.put(90, "XC");
		 romans.put(50, "L");
		 romans.put(40, "XL");
		 romans.put(10, "X");
		 romans.put(9, "IX");
		 romans.put(5, "V");
		 romans.put(4, "IV");
		 romans.put(1, I);
		 
		 for (int i = number; i > 0; i - romans.get)
		
		
//       String roman = "";
//       while(number>=1000){
//           roman += "M";
//           number-=1000;
//       }
//        
//       while(number>=900){
//           roman += "CM";
//           number-=900;
//       }
//        
//       while(number>=500){
//           roman += "D";
//           number-=500;
//       }
//        
//       while(number>=400){
//           roman += "CD";
//           number-=400;
//       }
//        
//       while(number>=100){
//           roman += "C";
//           number-=100;
//       } 
//        
//       while(number>=90){
//           roman += "XC";
//           number-=90;
//       }
//        
//       while(number>=50){
//           roman += "L";
//           number-=50;
//       }
//        
//       while(number>=40){
//           roman += "XL";
//           number-=40;
//       }
//        
//       while(number>=10){
//           roman += "X";
//           number-=10; 
//       }
//        
//       while(number>=9){
//           roman += "IX";
//           number-=9;
//       }
//        
//       while(number>=5){
//           roman += "V";
//           number-=5;
//       }
//        
//       while(number>=4){
//           roman += "IV";
//           number-=4;
//       }
//        
//       while(number>=1){
//           roman += "I";
//           number-=1;
//       }
//       return roman;
	}
	 
}
