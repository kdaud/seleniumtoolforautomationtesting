package org.logincredentials.util;


public class Search {
	
	private Patient patient;
	
	public String searchPatient(Patient patient) {
		
		if (patient.getPatient().containsKey(patient.getPatient())) {
			return patient.getPatient() + " -> " + patient.getAge();
		} else
			return "The entry is not found";
	}
	
}
