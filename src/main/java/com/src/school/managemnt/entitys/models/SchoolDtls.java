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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name = "School_Dtls")
public class SchoolDtls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "schoolID", unique = true, nullable = false)
	private long schoolID;

	@NotNull
	@Size(min = 3, max = 80)
	private String sName;

	@NotNull
	@Size(min = 3, max = 80)
	private String sPhoneNumber;

	@NotNull
	@Size(min = 3, max = 80)
	private String sMail;

	@NotNull
	@Size(min = 3, max = 80)
	private String sWebsite;

	@NotNull
	@Size(min = 3, max = 80)
	private String sPinCode;

	@NotNull
	@Size(min = 3, max = 80)
	private String sAddress1;

	@NotNull
	@Size(min = 3, max = 80)
	private String sAddress2;

	@NotNull
	@Size(min = 3, max = 80)
	private String sState;

	@NotNull
	@Size(min = 3, max = 80)
	private String sDistrict;

	@NotNull
	@Size(min = 3, max = 80)
	private String sCountry;

	@OneToMany(mappedBy = "schoolDtls", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	private Set<SchoolBranchDtls> schoolBranchDtls = new HashSet<>();

	public long getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(long schoolID) {
		this.schoolID = schoolID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPhoneNumber() {
		return sPhoneNumber;
	}

	public void setsPhoneNumber(String sPhoneNumber) {
		this.sPhoneNumber = sPhoneNumber;
	}

	public String getsMail() {
		return sMail;
	}

	public void setsMail(String sMail) {
		this.sMail = sMail;
	}

	public String getsWebsite() {
		return sWebsite;
	}

	public void setsWebsite(String sWebsite) {
		this.sWebsite = sWebsite;
	}

	public String getsPinCode() {
		return sPinCode;
	}

	public void setsPinCode(String sPinCode) {
		this.sPinCode = sPinCode;
	}

	public String getsAddress1() {
		return sAddress1;
	}

	public void setsAddress1(String sAddress1) {
		this.sAddress1 = sAddress1;
	}

	public String getsAddress2() {
		return sAddress2;
	}

	public void setsAddress2(String sAddress2) {
		this.sAddress2 = sAddress2;
	}

	public String getsState() {
		return sState;
	}

	public void setsState(String sState) {
		this.sState = sState;
	}

	public String getsDistrict() {
		return sDistrict;
	}

	public void setsDistrict(String sDistrict) {
		this.sDistrict = sDistrict;
	}

	public String getsCountry() {
		return sCountry;
	}

	public void setsCountry(String sCountry) {
		this.sCountry = sCountry;
	}

	public Set<SchoolBranchDtls> getSchoolBranchDtls() {
		return schoolBranchDtls;
	}

	public void setSchoolBranchDtls(Set<SchoolBranchDtls> schoolBranchDtls) {
		this.schoolBranchDtls = schoolBranchDtls;
	}
 
}
