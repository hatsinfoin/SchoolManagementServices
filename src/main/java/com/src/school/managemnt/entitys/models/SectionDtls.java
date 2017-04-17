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
@Table(name = "Section_Dtls")
public class SectionDtls {

	@NotNull
	@Size(min = 3, max = 80)
	private String sectionName; 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sectionID", unique = true, nullable = false)
	private long sectionID;
	
	@ManyToOne
	@JoinColumn(name = "classID", nullable = false)
	private ClassDtls classDtls;

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public long getSectionID() {
		return sectionID;
	}

	public void setSectionID(long sectionID) {
		this.sectionID = sectionID;
	}

	public ClassDtls getClassDtls() {
		return classDtls;
	}

	public void setClassDtls(ClassDtls classDtls) {
		this.classDtls = classDtls;
	}
	
	
	

 

}
