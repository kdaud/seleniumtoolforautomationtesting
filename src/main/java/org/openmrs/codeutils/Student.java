package org.openmrs.codeutils;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String studentName;
	
	private String courseCode;
	
	public Student(String name, String course) {
		super();
		this.studentName = name;
		this.courseCode = course;
	}
	
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public List<String> getStudentList() {
		List<String> student = new ArrayList<>();
		student.add("Gama Richard");
		student.add("Magari Godfrey");
		student.add("Daud Kakumirizi");
		student.add("Mukisa Cliff");
		
		return student;
	}
	
}
