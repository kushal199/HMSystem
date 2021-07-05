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
	@Column(name="doctor_id")
	private int doctorId;
	@Column(name="username")
	private String username;
	@Column(name="firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name="password")
	private String password;
	@Column(name="dob")
	private Date dob;
	@Column(name="department_id")
	private int departmentId;
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


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
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


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
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


	public Doctor(int doctorId, String username, String firstName, String lastName, String password, Date dob,
			int departmentId, String address, String email, String active, String phone) {
		super();
		this.doctorId = doctorId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dob;
		this.departmentId = departmentId;
		this.address = address;
		this.email = email;
		this.active = active;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", password=" + password + ", dob=" + dob + ", departmentId=" + departmentId + ", address="
				+ address + ", email=" + email + ", active=" + active + ", phone=" + phone + "]";
	}




	

	
}
