package com.codedecode.microservices.VaccinationCenter.Model;

public class Citizen {
	
	private int id;
	
	private String name;
	
	private int vaccinationCenterId;

	public Citizen() {
	}

	public Citizen(int id, String name, int vaccinationCenterId) {
		this.id = id;
		this.name = name;
		this.vaccinationCenterId = vaccinationCenterId;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", vaccinationCenterId=" + vaccinationCenterId + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
