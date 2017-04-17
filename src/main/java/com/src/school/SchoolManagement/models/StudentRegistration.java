package com.src.school.SchoolManagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "StudentRegistration")
public class StudentRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicationNo;
	@NotNull
	@Size(max = 80)
	private String admissionNo;
	@NotNull
	@Size(max = 80)
	private String classToApply;
	@NotNull
	@Size(max = 80)
	private String studentName;
	@NotNull
	@Size(max = 80)
	private String dob;
	@NotNull
	@Size(max = 80)
	private String firstLanguage;
	@NotNull
	@Size(max = 80)
	private String secondLanguage;
	@NotNull
	@Size(max = 80)
	private String thirdLanguage;
	@NotNull
	@Size(max = 80)
	private String identificationMarks1;
	@NotNull
	@Size(max = 80)
	private String identificationMarks2;
	@NotNull
	@Size(max = 80)
	private String fatherGuardian;
	@NotNull
	@Size(max = 80)
	private String motherName;
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
	private String previousClass;
	@NotNull
	@Size(max = 80)
	private String previousSchoolAdd;
	@NotNull
	@Size(max = 80)
	private String previousMarkes;
	@NotNull
	@Size(max = 80)
	private String extraAcademicCurricular;
	@NotNull
	@Size(max = 80)
	private String extracurricularAchievements;
	@NotNull
	@Size(max = 80)
	private String presentAddCommunication;
	@NotNull
	@Size(max = 80)
	private String permanentAddCommunication;
	@NotNull
	@Size(max = 80)
	private String medicalHistory;

	public StudentRegistration() {
	}

	public StudentRegistration(int applicationNo) {
		this.applicationNo = applicationNo;
	}

	public StudentRegistration(int applicationNo, String admissionNo, String classToApply, String studentName,
			String dob, String firstLanguage, String secondLanguage, String thirdLanguage, String identificationMarks1,
			String identificationMarks2, String fatherGuardian, String motherName, String fatherEducation,
			String fatherOccupation, String motherEducation, String motherOccupation, String previousClass,
			String previousSchoolAdd, String previousMarkes, String extraAcademicCurricular,
			String extracurricularAchievements, String presentAddCommunication, String permanentAddCommunication,
			String medicalHistory) {

		this.applicationNo = applicationNo;
		this.admissionNo = admissionNo;
		this.classToApply = classToApply;
		this.studentName = studentName;
		this.dob = dob;
		this.firstLanguage = firstLanguage;
		this.secondLanguage = secondLanguage;
		this.thirdLanguage = thirdLanguage;
		this.identificationMarks1 = identificationMarks1;
		this.identificationMarks2 = identificationMarks2;
		this.fatherGuardian = fatherGuardian;
		this.motherName = motherName;
		this.fatherEducation = fatherEducation;
		this.fatherOccupation = fatherOccupation;
		this.motherEducation = motherEducation;
		this.motherOccupation = motherOccupation;
		this.previousClass = previousClass;
		this.previousSchoolAdd = previousSchoolAdd;
		this.previousMarkes = previousMarkes;
		this.extraAcademicCurricular = extraAcademicCurricular;
		this.extracurricularAchievements = extracurricularAchievements;
		this.presentAddCommunication = presentAddCommunication;
		this.permanentAddCommunication = permanentAddCommunication;
		this.medicalHistory = medicalHistory;
	}

	public long getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(long applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getClassToApply() {
		return classToApply;
	}

	public void setClassToApply(String classToApply) {
		this.classToApply = classToApply;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFirstLanguage() {
		return firstLanguage;
	}

	public void setFirstLanguage(String firstLanguage) {
		this.firstLanguage = firstLanguage;
	}

	public String getSecondLanguage() {
		return secondLanguage;
	}

	public void setSecondLanguage(String secondLanguage) {
		this.secondLanguage = secondLanguage;
	}

	public String getThirdLanguage() {
		return thirdLanguage;
	}

	public void setThirdLanguage(String thirdLanguage) {
		this.thirdLanguage = thirdLanguage;
	}

	public String getIdentificationMarks1() {
		return identificationMarks1;
	}

	public void setIdentificationMarks1(String identificationMarks1) {
		this.identificationMarks1 = identificationMarks1;
	}

	public String getIdentificationMarks2() {
		return identificationMarks2;
	}

	public void setIdentificationMarks2(String identificationMarks2) {
		this.identificationMarks2 = identificationMarks2;
	}

	public String getFatherGuardian() {
		return fatherGuardian;
	}

	public void setFatherGuardian(String fatherGuardian) {
		this.fatherGuardian = fatherGuardian;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
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

	public String getPreviousClass() {
		return previousClass;
	}

	public void setPreviousClass(String previousClass) {
		this.previousClass = previousClass;
	}

	public String getPreviousSchoolAdd() {
		return previousSchoolAdd;
	}

	public void setPreviousSchoolAdd(String previousSchoolAdd) {
		this.previousSchoolAdd = previousSchoolAdd;
	}

	public String getPreviousMarkes() {
		return previousMarkes;
	}

	public void setPreviousMarkes(String previousMarkes) {
		this.previousMarkes = previousMarkes;
	}

	public String getExtraAcademicCurricular() {
		return extraAcademicCurricular;
	}

	public void setExtraAcademicCurricular(String extraAcademicCurricular) {
		this.extraAcademicCurricular = extraAcademicCurricular;
	}

	public String getExtracurricularAchievements() {
		return extracurricularAchievements;
	}

	public void setExtracurricularAchievements(String extracurricularAchievements) {
		this.extracurricularAchievements = extracurricularAchievements;
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

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	@Override
	public String toString() {
		return "StudentRegistration [applicationNo=" + applicationNo + ", admissionNo=" + admissionNo
				+ ", classToApply=" + classToApply + ", studentName=" + studentName + ", dob=" + dob
				+ ", firstLanguage=" + firstLanguage + ", secondLanguage=" + secondLanguage + ", thirdLanguage="
				+ thirdLanguage + ", identificationMarks1=" + identificationMarks1 + ", identificationMarks2="
				+ identificationMarks2 + ", fatherGuardian=" + fatherGuardian + ", motherName=" + motherName
				+ ", fatherEducation=" + fatherEducation + ", fatherOccupation=" + fatherOccupation
				+ ", motherEducation=" + motherEducation + ", motherOccupation=" + motherOccupation + ", previousClass="
				+ previousClass + ", previousSchoolAdd=" + previousSchoolAdd + ", previousMarkes=" + previousMarkes
				+ ", extraAcademicCurricular=" + extraAcademicCurricular + ", extracurricularAchievements="
				+ extracurricularAchievements + ", presentAddCommunication=" + presentAddCommunication
				+ ", permanentAddCommunication=" + permanentAddCommunication + ", medicalHistory=" + medicalHistory
				+ "]";
	}

}
