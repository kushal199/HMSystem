package com.hms.modal;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	private int patient_id;
	
	private String username;
	private String password;
	private String name;
	private String address;
	private Date dob;
	private String gender;
	private int aadhar;
	private int pin;
	private String active;
	private String phone;
	
	public Patient(){
		
	}
	
	public Patient(int patient_id, String username, String password, String name, String address, Date dob,
			String gender, int aadhar, int pin, String active,String phone) {
		super();
		this.patient_id = patient_id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.aadhar = aadhar;
		this.pin = pin;
		this.active = active;
		this.phone=phone;
	}
	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAadhar() {
		return aadhar;
	}

	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
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
		return "Patient [patient_id=" + patient_id + ", username=" + username + ", password=" + password + ", name="
				+ name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + ", aadhar=" + aadhar
				+ ", pin=" + pin + ", active=" + active + "]";
	}
	
	

}
