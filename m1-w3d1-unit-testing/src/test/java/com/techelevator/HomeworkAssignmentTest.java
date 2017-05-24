package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HomeworkAssignmentTest {
	private HomeworkAssignment myAssignment;
	
	@Before
	public void setup(){
		myAssignment = new HomeworkAssignment(100);
	}
	@Test
	public void able_to_set_and_get_total_marks(){
		myAssignment.setTotalMarks(80);
		Assert.assertEquals(80, myAssignment.getTotalMarks());
	}
	@Test
	public void able_to_set_and_get_submitter_name(){
		myAssignment.setSubmitterName("Sahill");
		Assert.assertEquals("Sahill", myAssignment.getSubmitterName());
	}
	@Test
	public void able_to_get_possible_marks(){
		Assert.assertEquals(100, myAssignment.getPossibleMarks());
	}
	
	@Test
	public void ninety_and_above(){
		myAssignment.setTotalMarks(95);
		Assert.assertEquals("A", myAssignment.getLetterGrade());
	}
	
	@Test
	public void eighty_and_above(){
		myAssignment.setTotalMarks(85);
		Assert.assertEquals("B", myAssignment.getLetterGrade());
	}
	
	@Test
	public void seventy_and_above(){
		myAssignment.setTotalMarks(75);
		Assert.assertEquals("C", myAssignment.getLetterGrade());
	}
	
	@Test
	public void sixty_and_above(){
		myAssignment.setTotalMarks(65);
		Assert.assertEquals("D", myAssignment.getLetterGrade());
	}
	
	@Test
	public void below_sixty(){
		myAssignment.setTotalMarks(55);
		Assert.assertEquals("F", myAssignment.getLetterGrade());
	}
}
