package com.hms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue
	@Column(name="appointment_id")
	private int appointmentId;
	@Column(name="patient_id")
	private int patientId;
	@Column(name="doctor_id")
	private int doctorId;
	@Column(name="datetime")
	private Date dateTime;
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

	public Appointment(int appointmentId, int patientId, int doctorId, Date dateTime, String feedback,
			String description, String prescription) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.dateTime = dateTime;
		this.feedback = feedback;
		this.description = description;
		this.prescription = prescription;
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

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
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
		return "Appointment [appointmentId=" + appointmentId + ", patientId=" + patientId + ", doctorId=" + doctorId
				+ ", dateTime=" + dateTime + ", feedback=" + feedback + ", description=" + description
				+ ", prescription=" + prescription + "]";
	}
	

}
