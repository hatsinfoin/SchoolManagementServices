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
@Table(name = "Class_Dtls")
public class ClassDtls {

	@NotNull
	@Size(min = 3, max = 80)
	private String className;

	@NotNull
	@Size(min = 3, max = 80)
	private String classTeacher;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "classID", unique = true, nullable = false)
	private long classID;

	@ManyToOne
	@JoinColumn(name = "schoolBranchId", nullable = false)
	private SchoolBranchDtls schoolBranchDtls;

	@OneToMany(mappedBy = "classDtls", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	private Set<SectionDtls> sectionDtls = new HashSet<>();
	
	/*public Set<SectionDtls> getSectionDtls() {
		return sectionDtls;
	}

	public void setSectionDtls(Set<SectionDtls> sectionDtls) {
		this.sectionDtls = sectionDtls;
	}*/

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
 
	public SchoolBranchDtls getSchoolBranchDtls() {
		return schoolBranchDtls;
	}

	public void setSchoolBranchDtls(SchoolBranchDtls schoolBranchDtls) {
		this.schoolBranchDtls = schoolBranchDtls;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public long getClassID() {
		return classID;
	}

	public void setClassID(long classID) {
		this.classID = classID;
	}

	
	
}
