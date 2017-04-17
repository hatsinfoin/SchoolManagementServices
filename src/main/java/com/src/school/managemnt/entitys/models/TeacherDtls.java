package com.src.school.managemnt.entitys.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Teacher_Dtls")
public class TeacherDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacherId", unique = true, nullable = false)
	private long teacherId;

	@Size(min = 3, max = 80)
	private String teacherName;

	@Size(min = 3, max = 80)
	private String teacherGender;

	@Size(min = 3, max = 80)
	private String teacherQualification;

	@NotNull
	@Size(max = 80)
	private String teacherMail;

	@NotNull
	@Size(max = 80)
	private String teacherAge;

	@NotNull
	@Size(max = 80)
	private String teacherContactNumber;

	@NotNull
	@Size(max = 80)
	private String teacherAddress;

	@NotNull
	@Size(max = 80)
	private boolean classTeacherFlag;

	/*@NotNull
	@Size(max = 80)
	private String schoolBranchId;
	*/
	//branch id is not accepting 
	

	@ManyToOne
	@JoinColumn(name = "schoolBranchId", nullable = false)
	private SchoolBranchDtls schoolBranchDtls;
	

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherGender() {
		return teacherGender;
	}

	public void setTeacherGender(String teacherGender) {
		this.teacherGender = teacherGender;
	}

	public String getTeacherQualification() {
		return teacherQualification;
	}

	public void setTeacherQualification(String teacherQualification) {
		this.teacherQualification = teacherQualification;
	}

	public String getTeacherMail() {
		return teacherMail;
	}

	public void setTeacherMail(String teacherMail) {
		this.teacherMail = teacherMail;
	}

	public String getTeacherAge() {
		return teacherAge;
	}

	public void setTeacherAge(String teacherAge) {
		this.teacherAge = teacherAge;
	}

	public String getTeacherContactNumber() {
		return teacherContactNumber;
	}

	public void setTeacherContactNumber(String teacherContactNumber) {
		this.teacherContactNumber = teacherContactNumber;
	}

	public String getTeacherAddress() {
		return teacherAddress;
	}

	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}

	public boolean isClassTeacherFlag() {
		return classTeacherFlag;
	}

	public void setClassTeacherFlag(boolean classTeacherFlag) {
		this.classTeacherFlag = classTeacherFlag;
	}

	/*public String getSchoolBranchId() {
		return schoolBranchId;
	}

	public void setSchoolBranchId(String schoolBranchId) {
		this.schoolBranchId = schoolBranchId;
	}*/

	public SchoolBranchDtls getSchoolBranchDtls() {
		return schoolBranchDtls;
	}

	public void setSchoolBranchDtls(SchoolBranchDtls schoolBranchDtls) {
		this.schoolBranchDtls = schoolBranchDtls;
	}

}
