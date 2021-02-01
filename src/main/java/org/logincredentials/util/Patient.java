package org.logincredentials.util;

import java.util.HashMap;
import java.util.Map;

public class Patient {
	
	private String name;
	
	private int age;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public Map<String, Integer> getPatient() {
		Map<String, Integer> patient = new HashMap<String, Integer>();
		patient.put("Henry", 54);
		patient.put("Isaac", 33);
		patient.put("Alex", 36);
		patient.put("David", 17);
		patient.put("Richard", 94);
		patient.put("Martin", 28);
		patient.put("Brain", 26);
		
		//patient.forEach((L, M) -> System.out.println(L + " " + M));
		System.out.println("***********");
		
		return patient;
	}
	
}
