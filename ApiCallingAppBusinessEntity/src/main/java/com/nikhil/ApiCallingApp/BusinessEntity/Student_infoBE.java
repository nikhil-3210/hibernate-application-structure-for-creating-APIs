package com.nikhil.ApiCallingApp.BusinessEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student_infoBE {
	
	@JsonProperty("Roll_No")	
	private long Roll_No;
	
	@JsonProperty("Student_Name")
	private String Student_Name;
	
	@JsonProperty("Student_Surname")
	private String Student_Surname;
	
	@JsonProperty("Student_MobileNo")
	private Long Student_MobileNo;

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

	public Long getStudent_MobileNo() {
		return Student_MobileNo;
	}

	public void setStudent_MobileNo(Long student_MobileNo) {
		Student_MobileNo = student_MobileNo;
	}

	
}
