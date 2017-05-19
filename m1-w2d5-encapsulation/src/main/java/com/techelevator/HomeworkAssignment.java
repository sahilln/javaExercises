package com.techelevator;

public class HomeworkAssignment {
		
	public HomeworkAssignment(int PossibleMarks){
		this.PossibleMarks = PossibleMarks;
	}
	
		private int TotalMarks;
		private int PossibleMarks;
		private String SubmitterName;
		private String LetterGrade;
	
		public int getTotalMarks(){
			return TotalMarks;
		}
		
		public void setTotalMarks(int TotalMarks){
			this.TotalMarks = TotalMarks;
		}
		
		public int getPossibleMarks(){
			return PossibleMarks;
		}
		
		public String getSubmitterName(){
			return SubmitterName;
		}
		
		public void setSubmitterName(String SubmitterName){
			this.SubmitterName = SubmitterName;
		}
		
		public String getLetterGrade(){
			double grade = ((double)TotalMarks/PossibleMarks) * 100;
			if(grade > 89){
				return "A";
			}
			else if(grade > 79){
				return "B";
			}
			else if(grade > 69){
				return "C";
			}
			else if(grade > 59){
				return "D";
			}
			else{
				return "F";
			}
	}	
}
