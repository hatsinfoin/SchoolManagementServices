package com.src.school.SchoolManagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="emps")
public class Employee {
	
@NotNull
@Size(min = 3, max = 80)
private String name;


@NotNull
@Size(min = 3, max = 80)
private String job;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;


public Employee(){}
public Employee(long id){
	this.id=id;
}
public Employee(String name,String job){
	this.name=name;
	this.job=job;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	System.out.println("Name : "+this.getName()+"  Job: "+this.getJob());

	return super.toString();
}
}
