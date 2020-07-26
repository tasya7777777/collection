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

	@Column(name = "firstName")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "addedLots")
	private String addedLots;

	public User() {
	}

	public User(String name) { this.name = name; }

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPassword(String password) {this.name = password; }

	public String getPassword() {
		return this.password;
	}

	public void setEmail(String email) {
		this.name = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setAddedLots(String addedLots) {
		this.name = addedLots;
	}

	public String getAddedLots() {
		return this.addedLots;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email = " + email +", addedLots =" +addedLots+",password ="+password+"]";
	}
}
