package com.techelevator;

public class MainVehicle {
	public static void main (String[] args){
		
		Vehicle[] vehicles = new Vehicle[] {new Car(true), new Car(false), new Tank(), new Truck(4), new Truck(6), new Truck(8)};
		System.out.println("Vehicle                  Distance Traveled        Toll$");
		System.out.println("-------------------------------------------------------");
		
		for (Vehicle eachVehicle: vehicles){
			int distance = 10 + (int)(Math.random() * (240-10));
			System.out.println(String.format("%-30s", eachVehicle.getVehicleType()) + String.format("%-20s", distance) + String.format("$%1$.2f", eachVehicle.calculateToll(distance)));
		}
	}
}