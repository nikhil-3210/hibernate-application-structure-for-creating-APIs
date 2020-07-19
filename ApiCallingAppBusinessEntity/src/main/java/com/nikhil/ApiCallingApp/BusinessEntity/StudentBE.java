package com.nikhil.ApiCallingApp.BusinessEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentBE {

	@JsonProperty("RollNo")
	private Long RollNo;
	
	@JsonProperty("StudentName")
	private String studentName;
	
	@JsonProperty("StudentSurname")
	private String StudentSurname;
	
	@JsonProperty("StudentMobileNo")
	private Long StudentMobileNo;
	
	@JsonProperty("StudentAddress")
	private String StudentAddress;

	public Long getRollNo() {
		return RollNo;
	}

	public void setRollNo(Long rollNo) {
		RollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return StudentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		StudentSurname = studentSurname;
	}

	public Long getStudentMobileNo() {
		return StudentMobileNo;
	}

	public void setStudentMobileNo(Long studentMobileNo) {
		StudentMobileNo = studentMobileNo;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
}
