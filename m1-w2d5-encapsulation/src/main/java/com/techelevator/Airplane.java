package com.techelevator;

public class Airplane {
	
	public Airplane(String PlaneNumber, int TotalFirstClassSeats, int TotalCoachSeats){
		this.PlaneNumber = PlaneNumber;
		this.TotalFirstClassSeats = TotalFirstClassSeats;
		this.TotalCoachSeats = TotalCoachSeats;
		AvailableFirstClassSeats = TotalFirstClassSeats;
		AvailableCoachSeats = TotalCoachSeats;
	}
	
	private String PlaneNumber;
	private int BookedFirstClassSeats;
	private int AvailableFirstClassSeats;
	private int TotalFirstClassSeats;
	private int BookedCoachSeats;
	private int AvailableCoachSeats;
	private int TotalCoachSeats;
	
	public String getPlaneNumber() {
		return PlaneNumber;
	}
	public int getBookedFirstClassSeats() {
		return TotalFirstClassSeats - AvailableFirstClassSeats;
	}
	public int getAvailableFirstClassSeats() {
		return AvailableFirstClassSeats;
	}
	public int getTotalFirstClassSeats() {
		return TotalFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return TotalCoachSeats - AvailableCoachSeats;
	}
	public int getAvailableCoachSeats() {
		return AvailableCoachSeats;
	}
	public int getTotalCoachSeats() {
		return TotalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
		if(forFirstClass){
			if(AvailableFirstClassSeats >= totalNumberOfSeats){
				AvailableFirstClassSeats -= totalNumberOfSeats;
				return true;
			}
			else{
				return false;
			}
		}
		else if(AvailableCoachSeats >= totalNumberOfSeats){
				AvailableCoachSeats -= totalNumberOfSeats;
				return true;
			}
		else{
			return false;
			}
		}
	}
