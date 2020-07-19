package com.nikhil.ApiCallingAppHBM.hbm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@Column(name = "RollNo")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("RollNo")
	private Long RollNo;
	
	@Column(name = "StudentName")
	@JsonProperty("StudentName")
	private String studentName;
	
	@Column(name = "StudentSurname")
	@JsonProperty("StudentSurname")
	private String StudentSurname;
	
	@Column(name = "StudentMobileNo")
	@JsonProperty("StudentMobileNo")
	private Long StudentMobileNo;
	
	@Column(name = "StudentAddress")
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
