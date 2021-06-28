package com.hms.modal;

import java.sql.Date;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class User {

	@Id
	private int doctor_id;
	

	

	private String firstname;
	private String lastname;
	private String password;
	private Date dob;
	private int department_id;
	private String address;
	private String email;
	private String active;
	private String username;
	private String phone;
	
public User() {
		
	}

public User(int doctor_id, String firstname, String lastname, String password, Date dob, int department_id,
		String address, String email, String active, String username,String phone) {
	super();
	this.doctor_id = doctor_id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.password = password;
	this.dob = dob;
	this.department_id = department_id;
	this.address = address;
	this.email = email;
	this.active = active;
	this.username = username;
	this.phone=phone;
}
	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}






	
	
	
	
	
//	public User(String firstname, String lastname, String username, String password) {
//		super();
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.username = username;
//		this.password = password;
//	}
////	public User(String firstname, String lastname, String username) {
////		super();
////		this.firstname = firstname;
////		this.lastname = lastname;
////		this.username = username;
////		//this.password = password;
////	}
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getFirstname() {
//		return firstname;
//	}
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//	public String getLastname() {
//		return lastname;
//	}
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "User [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + ", password="
//				+ password + "]";
//	}
	@Override
	public String toString() {
		return "User [doctor_id=" + doctor_id + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", dob=" + dob + ", department_id=" + department_id + ", address=" + address + ", email="
				+ email + ", active=" + active + ", username=" + username + "]";
	}
	
}
