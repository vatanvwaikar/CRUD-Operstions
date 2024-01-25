package com.school.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int Stud_Id;
	private String Stud_Name;
	private String Stud_Contact;
	private String Stud_Age;
	private String Stud_Gender;
	
	@JsonManagedReference
	@OneToOne(mappedBy = "student")
	private Address address;


	public int getStud_Id() {
		return Stud_Id;
	}


	public void setStud_Id(int stud_Id) {
		Stud_Id = stud_Id;
	}


	public String getStud_Name() {
		return Stud_Name;
	}


	public void setStud_Name(String stud_Name) {
		Stud_Name = stud_Name;
	}


	public String getStud_Contact() {
		return Stud_Contact;
	}


	public void setStud_Contact(String stud_Contact) {
		Stud_Contact = stud_Contact;
	}


	public String getStud_Age() {
		return Stud_Age;
	}


	public void setStud_Age(String stud_Age) {
		Stud_Age = stud_Age;
	}


	public String getStud_Gender() {
		return Stud_Gender;
	}


	public void setStud_Gender(String stud_Gender) {
		Stud_Gender = stud_Gender;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
}
