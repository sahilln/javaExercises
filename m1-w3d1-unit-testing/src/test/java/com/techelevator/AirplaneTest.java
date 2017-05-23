package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	private Airplane myAirplane;
	
	@Before
	public void setup(){
		myAirplane = new Airplane(50, 50);
	}
	
	@Test
	public void airplane_initializes_correctly(){
		Assert.assertEquals(0, myAirplane.getBookedFirstClassSeats());
		Assert.assertEquals(0, myAirplane.getBookedCoachSeats());
	}
	
	@Test
	public void plane_number_is_correct(){
		//Arrange
		String myPlaneNumber = "453011";
		
		//Assert
		Assert.assertEquals(myPlaneNumber, myAirplane.getPlaneNumber());
	}

	
	@Test
	public void correct_number_of_booked_first_class_seats(){
		//Assert
		Assert.assertEquals(0, myAirplane.getBookedFirstClassSeats());
	}
	
	@Test
	public void correct_number_of_available_first_class_seats(){
		//Assert
		Assert.assertEquals(50, myAirplane.getAvailableFirstClassSeats());
	}
	
	@Test
	public void correct_number_of_total_first_class_seats(){
		//Assert
		Assert.assertEquals(50, myAirplane.getTotalFirstClassSeats());
	}
	
	@Test
	public void correct_number_of_available_coach_seats(){
		//Assert
		Assert.assertEquals(50, myAirplane.getAvailableCoachSeats());
	}
	
	@Test
	public void correct_number_of_total_coach_seats(){
		//Assert
		Assert.assertEquals(50, myAirplane.getTotalCoachSeats());
	}
	
	@Test
	public void reserve_first_class_seat_if_true(){
		boolean success = myAirplane.Reserve(true, 1);
		Assert.assertTrue("I should book first class", success);
		Assert.assertEquals(1, myAirplane.getBookedFirstClassSeats());
		Assert.assertEquals(49, myAirplane.getAvailableFirstClassSeats());
	}
	
	@Test
	public void reserve_first_class_seat_if_enough_seats(){
		
	}
		
}