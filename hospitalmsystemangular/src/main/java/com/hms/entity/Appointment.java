package com.hms.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointment_id;
	@Column(name="patient_id")
	private int patient_id;
	@Column(name="doctor_id")
	private int doctor_id;
	@Column(name="datetime")
	private Date datetime;
	@Column(name="feedback")
	private String feedback;
	@Column(name="description")
	private String description;
	@Column(name="prescription")
	private String prescription;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int appointment_id, int patient_id, int doctor_id, Date datetime, String feedback,
			String description, String prescription) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.datetime = datetime;
		this.feedback = feedback;
		this.description = description;
		this.prescription = prescription;
	}

	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", patient_id=" + patient_id + ", doctor_id="
				+ doctor_id + ", datetime=" + datetime + ", feedback=" + feedback + ", description=" + description
				+ ", prescription=" + prescription + "]";
	}


}
