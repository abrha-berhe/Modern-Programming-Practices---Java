package prob2A;

import java.util.*;

public class GradeReport {
	private Student student;
	private String grade;
	
	public GradeReport(Student student) {
		 this.student = student;		
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public String getGrade() {
		return grade;
	}
	 

}
