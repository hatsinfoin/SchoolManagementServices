package com.src.school.managemnt.entitys.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Attendence_Dtls")
public class AttendenceDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attendenceID", unique = true, nullable = false)
	private long attendenceID; 
	
	@NotNull
	@Size(min = 3, max = 80)
	private Date date;
	
	@NotNull
	@Size(min = 3, max = 80)
	private Boolean attendenceStatus;
	

	@OneToOne
	@JoinColumn(name = "studentKeyID", nullable = false)
	private StudentDtls studentDtls;


	public long getAttendenceID() {
		return attendenceID;
	}


	public void setAttendenceID(long attendenceID) {
		this.attendenceID = attendenceID;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Boolean getAttendenceStatus() {
		return attendenceStatus;
	}


	public void setAttendenceStatus(Boolean attendenceStatus) {
		this.attendenceStatus = attendenceStatus;
	}


	public StudentDtls getStudentDtls() {
		return studentDtls;
	}


	public void setStudentDtls(StudentDtls studentDtls) {
		this.studentDtls = studentDtls;
	}
	

}
