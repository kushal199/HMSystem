package com.hms.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctor_id;
	@Column(name="username")
	private String username;
	@Column(name="firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name="password")
	private String password;
	@Column(name="dob")
	private Date dob;
	@Column(name="department_id")
	private int department_id;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="active")
	private String active;
	@Column(name="phone")
	private String phone;

	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(int doctor_id, String username, String firstname, String lastname, String password, Date dob,
			int department_id, String address, String email, String active, String phone) {
		super();
		this.doctor_id = doctor_id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.dob = dob;
		this.department_id = department_id;
		this.address = address;
		this.email = email;
		this.active = active;
		this.phone = phone;
	}


	public int getDoctor_id() {
		return doctor_id;
	}


	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Doctor [doctor_id=" + doctor_id + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", password=" + password + ", dob=" + dob + ", department_id=" + department_id
				+ ", address=" + address + ", email=" + email + ", active=" + active + ", phone=" + phone + "]";
	}

	
}
