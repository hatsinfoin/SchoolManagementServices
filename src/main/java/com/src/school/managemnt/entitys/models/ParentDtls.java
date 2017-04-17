package com.src.school.managemnt.entitys.models;

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
@Table(name = "Parent_Dtls")
public class ParentDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parentId", unique = true, nullable = false)
	private long parentId;

	@Size(min = 3, max = 80)
	private String fatherName;

	@Size(min = 3, max = 80)
	private String motherName;

	@Size(min = 3, max = 80)
	private String localGuardianName;

	@NotNull
	@Size(max = 80)
	private String fatherEducation;

	@NotNull
	@Size(max = 80)
	private String fatherOccupation;

	@NotNull
	@Size(max = 80)
	private String motherEducation;

	@NotNull
	@Size(max = 80)
	private String motherOccupation;

	@NotNull
	@Size(max = 80)
	private String contactNumber;

	@NotNull
	@Size(max = 80)
	private String emergencyContactNumber;

	@NotNull
	@Size(max = 80)
	private String presentAddCommunication;

	@NotNull
	@Size(max = 80)
	private String permanentAddCommunication;

	@OneToOne
	@JoinColumn(name = "studentKeyID", nullable = false)
	private StudentDtls studentDtls;

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getLocalGuardianName() {
		return localGuardianName;
	}

	public void setLocalGuardianName(String localGuardianName) {
		this.localGuardianName = localGuardianName;
	}

	public String getFatherEducation() {
		return fatherEducation;
	}

	public void setFatherEducation(String fatherEducation) {
		this.fatherEducation = fatherEducation;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getMotherEducation() {
		return motherEducation;
	}

	public void setMotherEducation(String motherEducation) {
		this.motherEducation = motherEducation;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getPresentAddCommunication() {
		return presentAddCommunication;
	}

	public void setPresentAddCommunication(String presentAddCommunication) {
		this.presentAddCommunication = presentAddCommunication;
	}

	public String getPermanentAddCommunication() {
		return permanentAddCommunication;
	}

	public void setPermanentAddCommunication(String permanentAddCommunication) {
		this.permanentAddCommunication = permanentAddCommunication;
	}

	public StudentDtls getStudentDtls() {
		return studentDtls;
	}

	public void setStudentDtls(StudentDtls studentDtls) {
		this.studentDtls = studentDtls;
	}

}
