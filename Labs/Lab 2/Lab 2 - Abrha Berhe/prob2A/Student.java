package prob2A;

import java.util.*;

public class Student {
	private String name;
	private GradeReport gradeReport;

	public Student(String name) {
		this.name = name;
		gradeReport = new GradeReport(this);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public GradeReport gradeReport() {
		return gradeReport;
	}

}
