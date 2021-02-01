package org.openmrs.codeutils;


public class TesteRun {
	Student student;
	
	public static void main(String[] args) {
		Search search = new Search();
		System.out.println(search.retrieveStudentName(new Student("Gama Richards", "")));
	}
	
}
