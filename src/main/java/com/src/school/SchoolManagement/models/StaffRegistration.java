package com.src.school.SchoolManagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "StaffRegistration")
public class StaffRegistration {

	
 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int staffId;
	
	@NotNull
	@Size(max = 80)
	private String staffName;
	 
	
	@NotNull
	@Size(max = 80)
	private String dob;

	 

	@NotNull
	@Size(max = 80)
	private String staffMobileNo;
	@NotNull
	@Size(max = 80)
	private String staffEmail;

	@NotNull
	@Size(max = 80)
	private String permanentAddressCommunication;

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

  

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	 

	public String getStaffMobileNo() {
		return staffMobileNo;
	}

	public void setStaffMobileNo(String staffMobileNo) {
		this.staffMobileNo = staffMobileNo;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public String getPermanentAddressCommunication() {
		return permanentAddressCommunication;
	}
	public StaffRegistration(){}
	public StaffRegistration(int staffId){}
	public StaffRegistration(int staffId, String staffName, String optradioGender, String studentName, String dob,
			String optradioStream, String staffMobileNo, String staffEmail, String permanentAddressCommunication) {
		this.staffId = staffId;
		this.staffName = staffName;
 		this.dob = dob;
 		this.staffMobileNo = staffMobileNo;
		this.staffEmail = staffEmail;
		this.permanentAddressCommunication = permanentAddressCommunication;
	}

	public void setPermanentAddressCommunication(String permanentAddressCommunication) {
		this.permanentAddressCommunication = permanentAddressCommunication;
	}

	@Override
	public String toString() {
		return "StaffRegistration [staffId=" + staffId + ", staffName=" + staffName + ", dob=" + dob
				+ ", staffMobileNo=" + staffMobileNo + ", staffEmail=" + staffEmail + ", permanentAddressCommunication="
				+ permanentAddressCommunication + "]";
	}

	 
	

}
