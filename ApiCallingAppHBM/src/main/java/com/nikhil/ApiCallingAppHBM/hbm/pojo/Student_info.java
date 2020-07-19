package com.nikhil.ApiCallingAppHBM.hbm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Student_info")
public class Student_info {

	@Id
	@Column(name = "Roll_No", nullable = false, insertable = false, updatable = false) // columnDefinition = "BIGINT(20)
	@JsonProperty("Roll_No")	
	private long Roll_No;
	
	@Column(name = "Student_Name", nullable = false) // columnDefinition = "BIGINT(20)
	@JsonProperty("Student_Name")
	private String Student_Name;
	
	@Column(name = "Student_Surname", nullable = false) // columnDefinition = "BIGINT(20)
	@JsonProperty("Student_Surname")
	private String Student_Surname;
	
	@Column(name = "Student_MobileNo", nullable = false) // columnDefinition = "BIGINT(20)
	@JsonProperty("Student_MobileNo")
	private long Student_MobileNo;

	public long getRoll_No() {
		return Roll_No;
	}

	public void setRoll_No(long roll_No) {
		Roll_No = roll_No;
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public String getStudent_Surname() {
		return Student_Surname;
	}

	public void setStudent_Surname(String student_Surname) {
		Student_Surname = student_Surname;
	}

	public long getStudent_MobileNo() {
		return Student_MobileNo;
	}

	public void setStudent_MobileNo(long student_MobileNo) {
		Student_MobileNo = student_MobileNo;
	}

	
}
