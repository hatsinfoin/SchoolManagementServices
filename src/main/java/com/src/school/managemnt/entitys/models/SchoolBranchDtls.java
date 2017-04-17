package com.src.school.managemnt.entitys.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "School_Branch_Dtls")
public class SchoolBranchDtls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "schoolBranchId", unique = true, nullable = false)

	@Size(min = 3, max = 80)
	private long schoolBranchId;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchName;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchPhoneNumber;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchMail;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchWebsite;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchPinCode;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchAddress1;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchAddress2;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchState;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchDistrict;

	@NotNull
	@Size(min = 3, max = 80)
	private String branchCountry;

	@ManyToOne
	@JoinColumn(name = "schoolID", nullable = false)
	private SchoolDtls schoolDtls;

	
	@OneToMany(mappedBy = "schoolBranchDtls", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	private Set<ClassDtls> classDtls = new HashSet<>();
	
	@OneToMany(mappedBy = "schoolBranchDtls", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	private Set<TeacherDtls> teacherDtls = new HashSet<>();
	
	

	
	
	public Set<TeacherDtls> getTeacherDtls() {
		return teacherDtls;
	}

	public void setTeacherDtls(Set<TeacherDtls> teacherDtls) {
		this.teacherDtls = teacherDtls;
	}

	public Set<ClassDtls> getClassDtls() {
		return classDtls;
	}

	public void setClassDtls(Set<ClassDtls> classDtls) {
		this.classDtls = classDtls;
	}

	public long getSchoolBranchId() {
		return schoolBranchId;
	}

	public void setSchoolBranchId(long schoolBranchId) {
		this.schoolBranchId = schoolBranchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchPhoneNumber() {
		return branchPhoneNumber;
	}

	public void setBranchPhoneNumber(String branchPhoneNumber) {
		this.branchPhoneNumber = branchPhoneNumber;
	}

	public String getBranchMail() {
		return branchMail;
	}

	public void setBranchMail(String branchMail) {
		this.branchMail = branchMail;
	}

	public String getBranchWebsite() {
		return branchWebsite;
	}

	public void setBranchWebsite(String branchWebsite) {
		this.branchWebsite = branchWebsite;
	}

	public String getBranchPinCode() {
		return branchPinCode;
	}

	public void setBranchPinCode(String branchPinCode) {
		this.branchPinCode = branchPinCode;
	}

	public String getBranchAddress1() {
		return branchAddress1;
	}

	public void setBranchAddress1(String branchAddress1) {
		this.branchAddress1 = branchAddress1;
	}

	public String getBranchAddress2() {
		return branchAddress2;
	}

	public void setBranchAddress2(String branchAddress2) {
		this.branchAddress2 = branchAddress2;
	}

	public String getBranchState() {
		return branchState;
	}

	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}

	public String getBranchDistrict() {
		return branchDistrict;
	}

	public void setBranchDistrict(String branchDistrict) {
		this.branchDistrict = branchDistrict;
	}

	public String getBranchCountry() {
		return branchCountry;
	}

	public void setBranchCountry(String branchCountry) {
		this.branchCountry = branchCountry;
	}

	public SchoolDtls getSchoolDtls() {
		return schoolDtls;
	}

	public void setSchoolDtls(SchoolDtls schoolDtls) {
		this.schoolDtls = schoolDtls;
	}

	
	
}
