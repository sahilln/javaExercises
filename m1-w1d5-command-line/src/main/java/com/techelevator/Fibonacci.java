package com.techelevator;



/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Fibonacci number:");
		int num = input.nextInt();
		if(num == 0){
			System.out.println("0");
		}
		else{
			System.out.print("0 1 ");
			int i = 1;
			int j = 1;
			int k = 0;
			while(k < num){
				System.out.print(" ");
				k = i + j;
				i = j;
				j = k;
					if (k < num){
						System.out.print(k);
					}
			}
		}
	}
}
