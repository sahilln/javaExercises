package com.techelevator;

import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter the weight of your package: ");
		double weight = input.nextDouble();
		input.nextLine();
		System.out.println("(P)ounds or (O)unces?");
		String unit = input.nextLine();
		System.out.println("What distance will it be traveling to?");
		double distance = input.nextDouble();
		
		DELIVERYDRIVERINTERFACE[] rates = new DELIVERYDRIVERINTERFACE[] {new PostalService("1st Class", unit), new PostalService("2nd Class", unit), new PostalService("3rd Class", unit), new FEXED(), new SPU("4-day ground", unit), new SPU("2-day business", unit), new SPU("next day", unit)};
		
		System.out.println("Delivery Method:                  " + "$ cost ");
		System.out.println("----------------------------------------------");
		
		for(DELIVERYDRIVERINTERFACE eachRate: rates){
			System.out.println(String.format("%-30s", eachRate.getDeliveryMethod()) + "    " + String.format("$%1$.2f", eachRate.calculateRate(distance, weight)));
		}
	}
}