package com.techelevator;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String binary = "";
		System.out.println("Please enter a decimal value:");
		int decimal = input.nextInt();
		
		for (int i = decimal; i > 0; i = i / 2){
			int remainder = i % 2;
			binary = binary + remainder;
		}
		binary = new StringBuilder(binary).reverse().toString();
		System.out.print(binary);
	}
}