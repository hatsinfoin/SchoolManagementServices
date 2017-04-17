package com.src.school.managemnt.entitys.models.user;
 
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user") 
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private long userID; 
	
	@NotNull
	@Size(min = 3, max = 20)
	private String userName;
	
	
	@NotNull
	@Size(min = 3, max = 20)
	private String password;


	public long getUserID() {
		return userID;
	}


	public void setUserID(long userID) {
		this.userID = userID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
