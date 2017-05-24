package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	private Elevator myElevator;
	
	@Before
	public void setup(){
		myElevator = new Elevator(2, 10);
	}
	
	@Test
	public void elevator_initializes_correctly(){
		//Assert
		Assert.assertTrue("Door should initially be open", myElevator.isDoorOpen());
	}
	
	@Test
	public void able_to_retrieve_shaft_number_of_elevator(){
		Assert.assertEquals(2, myElevator.getShaftNumber());
	}
	
	@Test
	public void able_to_get_current_level_of_elevator(){
		Assert.assertEquals(1, myElevator.getCurrentLevel());
	}
	
	@Test
	public void able_to_get_number_of_levels_for_elevator(){
		Assert.assertEquals(10, myElevator.getNumberOfLevels());
	}
	
	@Test
	public void is_elevator_moving(){
		Assert.assertFalse(myElevator.isMoving());
	}
	
	@Test
	public void does_elevator_door_close(){
		myElevator.CloseDoor();
		Assert.assertEquals(false, myElevator.isDoorOpen());
	}
	
	@Test
	public void does_elevator_door_open(){
		myElevator.CloseDoor();
		myElevator.OpenDoor();
		Assert.assertEquals(true, myElevator.isDoorOpen());
	}
	
	@Test
	public void elevator_can_move_up(){
		myElevator.CloseDoor();
		myElevator.GoUp(4);
		Assert.assertEquals(4, myElevator.getCurrentLevel());
	}
	
	@Test
	public void elevator_can_move_up_only_when_door_closed(){
		myElevator.OpenDoor();
		myElevator.GoUp(5);
		Assert.assertEquals(1, myElevator.getCurrentLevel());
	}
	
	@Test
	public void elevator_cant_go_past_number_of_levels(){
		myElevator.CloseDoor();
		Assert.assertFalse("Elevator should not go past total number of levels", myElevator.GoUp(11));
	}
	
	@Test
	public void elevator_can_go_to_highest_floor(){
		//Arrange
		myElevator.CloseDoor();
		myElevator.GoUp(9);
		
		
		//Act
		myElevator.GoUp(10);
		
		//Assert
		Assert.assertEquals(10, myElevator.getCurrentLevel());
	}
	@Test
	public void elevator_only_goes_up(){
		myElevator.CloseDoor();
		myElevator.GoUp(5);
		myElevator.GoUp(2);
		Assert.assertEquals(5, myElevator.getCurrentLevel());
	}
	
// goes down

	@Test
	public void elevator_can_move_down(){
		myElevator.CloseDoor();
		myElevator.GoUp(4);
		myElevator.GoDown(1);
		Assert.assertEquals(1, myElevator.getCurrentLevel());
	}

	@Test
	public void elevator_can_move_down_only_when_door_closed(){
		myElevator.OpenDoor();
		myElevator.GoUp(5);
		myElevator.GoDown(2);
		Assert.assertEquals(1, myElevator.getCurrentLevel());
	}

	@Test
	public void elevator_cant_go_lower_than_1(){
		myElevator.CloseDoor();
		Assert.assertFalse("Elevator should not go lower than 1", myElevator.GoDown(0));
	}

	@Test
	public void elevator_can_go_to_first_floor(){
	//Arrange
		myElevator.CloseDoor();
		myElevator.GoUp(9);
		myElevator.GoDown(1);
	
	//Assert
		Assert.assertEquals(1, myElevator.getCurrentLevel());
	}
	@Test
	public void elevator_only_goes_down_when_Go_Down_is_called(){
		myElevator.CloseDoor();
		myElevator.GoUp(5);
		myElevator.GoDown(7);
		Assert.assertEquals(5, myElevator.getCurrentLevel());
	}
}
