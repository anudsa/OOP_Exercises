package classes;

import java.util.Comparator;

public class Student {
	
	 String firstName;
     String lastName;
     int registration;
     int grade;
     int year;
     
     
     
     public void printFullName(){
    	 System.out.println("Name: " + firstName + " " + lastName);
      }

      public boolean isApproved(){
          //TODO implement: should return true if grade >= 60
    	  if(grade >= 60) 
    	  {  
    		  return true;
    	  }
    	  else 
    	  {    		  
    			return false;     
    	  }	 	    
      }

      public int changeYearIfApproved(){
          //TODO implement: the student should advance to the next year if he/she grade is >= 60
          // Make year = year + 1, and print "Congragulations" if the student has been approved
    	  
    	  if(grade >= 60) 
    	  {
    		  
    		  year = year +1 ;
    		  
    		  System.out.println("Congratulations");
    		  
    	  }
    	  
    	  
          return 0;
      }

      public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	   }
	
	   public Student(Student student) {
	        this.firstName = student.firstName;
	        this.lastName = student.lastName;
	        this.registration = student.registration;
	        this.grade = student.grade;
	        this.year = student.year;
	    }
	   

	   public Student() {
	
	   }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Se agrego a: " + firstName + " " + lastName + " ID:" + registration
				+ " Grado: " + grade + " Año: " + year;
	}
	
	
	

}
