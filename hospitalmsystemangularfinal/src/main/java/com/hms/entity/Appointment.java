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
	@Column(name="appointment_id")
	private int appointmentId;
	@Column(name="patient_id")
	private int patientId;
	@Column(name="doctor_id")
	private int doctorId;
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

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
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

	public Appointment(int appointmentId, int patientId, int doctorId, Date datetime, String feedback,
			String description, String prescription) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.datetime = datetime;
		this.feedback = feedback;
		this.description = description;
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", patientId=" + patientId + ", doctorId=" + doctorId
				+ ", datetime=" + datetime + ", feedback=" + feedback + ", description=" + description
				+ ", prescription=" + prescription + "]";
	}

	

	


}
