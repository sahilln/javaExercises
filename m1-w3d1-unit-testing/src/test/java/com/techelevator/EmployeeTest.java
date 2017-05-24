package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee myEmployee;


	@Before
	public void setup(){
		myEmployee = new Employee(2, "Sahill", "Naik", 1000.00);
	}
	
	@Test
	public void employee_initializes_correctly(){
		Assert.assertEquals(2, myEmployee.getEmployeeId());
		Assert.assertEquals("Sahill", myEmployee.FirstName());
		Assert.assertEquals("Naik", myEmployee.LastName());
		Assert.assertEquals("website", myEmployee.getDepartment());
		Assert.assertEquals(1000.00, myEmployee.getAnnualSalary(), 0.01);
		Assert.assertEquals("Naik, Sahill", myEmployee.FullName());
	}
	
	@Test
	public void able_to_set_department(){
		myEmployee.setDepartment("HR");
		Assert.assertEquals("HR", myEmployee.getDepartment());
	}
	
	@Test
	public void able_to_raise_salary(){
		double perc = 10.0;
			myEmployee.RaiseSalary(perc);
			Assert.assertEquals(1100.00, myEmployee.getAnnualSalary(), 0.01);
			
	}
}
