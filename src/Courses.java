package classes;
import classes.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Courses {
	
	
	String courseName;
	String professorName;
	int year;
	
	
	

	ArrayList<Student> list=new ArrayList<Student>();
	
	   public void enroll(Student student){
		   
		   //TODO add the student to the collection
		   			
			//Adding object in arraylist
			list.add(student);  
		 			
			
		 
			System.out.println(student);  
			
			
		   
		   }

		   public void unEnroll(Student student){
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
			   
			   if(list.isEmpty()) 
			   {
				   System.out.println("No existe ese bato");
				   
			   }else {
				   
				   System.out.println("Se elimino a:" + student.firstName);
				   list.remove(student);   
			   }			   							
			   
		   }

		   public int countStudents(){
		       //TODO implement
			   
			   int tamaño = list.size();			   			   			  		
			   
			   System.out.println("El tamaño de la coleccion es de: " + tamaño);
		       return tamaño;
		   }
		   
		   public int bestGrade(){
		       //TODO implement
			   
	
			 int maxGrade = -1;
			 List<Student> topStudents = new ArrayList<>();

			 
			 
			 for (Student students : list) {
			     if (students.grade > maxGrade) {
			         maxGrade = students.grade;
			         topStudents.clear();
			         topStudents.add(students);
			     } else if (students.grade == maxGrade) {
			         topStudents.add(students);
			     }
			 }
			 
			 System.out.println("Los estudiantes con las calificaciones más altas son:");

			 
			 for (Student students : topStudents) {
				    System.out.println("Nombre: " + students.firstName + " " + students.lastName);
				    System.out.println("Calificación: " + students.grade);

				}
			    
			   
			   
			   
		       return 0;
		   }
		   
		   
		   
		   public static void main(String[]args) 
		   {
			   
			   
			   Courses c = new Courses();
			   
			   Student s = new Student("Juanito","Tiro",32453,100,2019);
			   Student s2 = new Student("Jesus","Cordero",854,10,2019);
			   Student s3 = new Student("Ivan","M",32453,10,2019);
			   Student s4 = new Student("Anwar","D",32453,70,2019);
			   Student s5 = new Student("Iber","F",32453,40,2019);
			   			   
			   
			    c.enroll(s);			    
			    c.enroll(s2);
			    c.enroll(s3);
			    c.enroll(s4);
			    c.enroll(s5);
			    
			    
			    c.unEnroll(s2);
			    
			    c.countStudents();
			    
			    c.bestGrade();
			    
			   
		   }

	
	

}
