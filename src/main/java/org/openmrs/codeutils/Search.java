package org.openmrs.codeutils;


public class Search {
	
	public String retrieveStudentName(Student studnt) {
		if(studnt.getStudentList().contains(studnt.getStudentName())) {
			return studnt.getStudentName();
		}
		return null;
	}
}
