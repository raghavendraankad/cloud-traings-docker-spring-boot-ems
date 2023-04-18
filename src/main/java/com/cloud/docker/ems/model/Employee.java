package com.cloud.docker.ems.model;

public class Employee {

	private Long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobNum;
	
	public Employee() {
	}
	
	public Employee(Long id, String firstName, String lastName, String emailId, String mobNum) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.mobNum=mobNum;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
