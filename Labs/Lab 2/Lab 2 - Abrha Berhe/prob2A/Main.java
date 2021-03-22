package prob2A;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		//////////////// When an instance of Student is created, instance of GradeReport is implicitly created
		Student st1 = new Student("Awet");		 
		st1.gradeReport().setGrade("A");

		Student st2 = new Student("John");	 
		st2.gradeReport().setGrade("A+");

		Student st3 = new Student("Lidya");		 
		st3.gradeReport().setGrade("A-");
		
		System.out.println("Name: "+st1.getName()+"\nGrade: "+st1.gradeReport().getGrade());

	}

}
