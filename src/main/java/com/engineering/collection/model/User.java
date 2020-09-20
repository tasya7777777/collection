package com.engineering.collection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "userName")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "addedLots")
	private String addedLots;

	public User() {
	}

	public User(String userName) { this.userName = userName; }

	public long getId() {
		return id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setPassword(String password) {this.userName = password; }

	public String getPassword() {
		return this.password;
	}

	public void setEmail(String email) {
		this.userName = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setAddedLots(String addedLots) {
		this.userName = addedLots;
	}

	public String getAddedLots() {
		return this.addedLots;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + userName + ", email = " + email +", addedLots =" +addedLots+",password ="+password+"]";
	}
}
