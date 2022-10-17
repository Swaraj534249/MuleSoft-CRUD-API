package com.crudapi.CRUD.API.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private long rollNo;
	private String name;
	private String email;
	private String contact;
	private String address;
	
	
	public Student() {
		super();
	}

	public Student(long rollNo, String name, String email, String contact, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ ", address=" + address + ", getRollNo()=" + getRollNo() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getContact()=" + getContact() + ", getAddress()=" + getAddress() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
