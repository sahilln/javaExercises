package com.techelevator;

public class Employee {

		private int EmployeeId;
		private String FirstName;
		private String LastName;
		private String FullName;
		private String Department;
		private double AnnualSalary;
		
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		public int getEmployeeId() {
			return EmployeeId;
		}
		public String getFirstName() {
			return FirstName;
		}
		public String getFullName() {
			return LastName + ", " + FirstName;
		}
		public double getAnnualSalary() {
			return AnnualSalary;
		}
		
		public void raiseSalary(double percent){
			AnnualSalary = AnnualSalary * ((percent / 100) + 1);
		}
		
		public Employee(int EmployeeId, String FirstName, String LastName, double salary){
			this.EmployeeId = EmployeeId;
			this.FirstName = FirstName;
			this.LastName = LastName;
			this.AnnualSalary = salary;
			
		}
}
