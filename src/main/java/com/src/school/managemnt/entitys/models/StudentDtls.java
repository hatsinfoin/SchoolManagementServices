package com.src.school.managemnt.entitys.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Student_Dtls")
public class StudentDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentKeyID", unique = true, nullable = false)
	private long studentKeyID;

	@NotNull
	@Size(min = 3, max = 80)
	private String studentID;

	@NotNull
	@Size(min = 3, max = 80)
	private long applicationNo;

	@NotNull
	@Size(min = 3, max = 80)
	private String classID;

	@NotNull
	@Size(min = 3, max = 80)
	private String schoolBranchId;

	@NotNull
	@Size(min = 3, max = 80)
	private String sectionID;

	@NotNull
	@Size(min = 3, max = 80)
	private String studentStatus;

	@NotNull
	@Size(min = 3, max = 80)
	private long parentId;

	@OneToOne(mappedBy = "studentDtls", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	private ParentDtls parentDtls = new ParentDtls();

	@OneToOne(mappedBy = "studentDtls", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	private AttendenceDtls attendenceDtls = new AttendenceDtls();

	public long getStudentKeyID() {
		return studentKeyID;
	}

	public void setStudentKeyID(long studentKeyID) {
		this.studentKeyID = studentKeyID;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public long getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(long applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}

	public String getSchoolBranchId() {
		return schoolBranchId;
	}

	public void setSchoolBranchId(String schoolBranchId) {
		this.schoolBranchId = schoolBranchId;
	}

	public String getSectionID() {
		return sectionID;
	}

	public void setSectionID(String sectionID) {
		this.sectionID = sectionID;
	}

	public String getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public ParentDtls getParentDtls() {
		return parentDtls;
	}

	public void setParentDtls(ParentDtls parentDtls) {
		this.parentDtls = parentDtls;
	}

	public AttendenceDtls getAttendenceDtls() {
		return attendenceDtls;
	}

	public void setAttendenceDtls(AttendenceDtls attendenceDtls) {
		this.attendenceDtls = attendenceDtls;
	}

}
