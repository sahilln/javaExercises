package com.techelevator;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double length, meter, feet;
		String unit;
		
		System.out.println("Please enter the length: ");
		length = input.nextDouble();
		input.nextLine();
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		unit = input.nextLine();
		
		if (unit.equals("m")){
			feet = length * 3.2808399; 
			System.out.println(length + unit + " is " + feet + "f.");
		}
		else{
			meter = length * 0.3048;
			System.out.println(length + unit + " is " + meter + "m.");
		}
	}
}
