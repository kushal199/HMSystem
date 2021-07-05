/*

package com.hms.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hms.entity.Admin;
import com.hms.entity.Appointment;
import com.hms.entity.Department;
import com.hms.entity.Doctor;
import com.hms.entity.Patient;
import com.hms.repository.AdminRepository;
import com.hms.repository.AppointmentRepository;
import com.hms.repository.DepartmentRepository;
import com.hms.repository.DoctorRepository;
import com.hms.repository.PatientRepository;

@Service
@Transactional
public class UserService {

	private final DoctorRepository userRep;
	private final PatientRepository patientRep;
	private final DepartmentRepository departmentRep;
	private final AppointmentRepository appointmentRep;
	private final AdminRepository adminRep;

	public UserService(DoctorRepository userRep, PatientRepository patientRep, DepartmentRepository departmentRep,
			AppointmentRepository appointmentRep, AdminRepository adminRep) {
		// super();
		this.userRep = userRep;
		this.patientRep = patientRep;
		this.departmentRep = departmentRep;
		this.appointmentRep = appointmentRep;
		this.adminRep = adminRep;
	}

	public void saveUser(Doctor user) {
		userRep.save(user);

	}

	public void check() {
		userRep.getUser().forEach(e -> System.out.println(e));
	}

	public void inse() {
		userRep.insert();
	}

	public Doctor findByUsernameAndPassword(String username, String password) {
		return userRep.findByUsernameAndPassword(username, password);
	}

	public Admin findByUsernameAndPassword_Admin(String username, String password) {
		return adminRep.findByUsernameAndPassword(username, password);
	}

//	public List<Doctor> showAllUsers(){
//		List<Doctor> users = new ArrayList<Doctor>();
//		for(Doctor user : userRep.findAll()) {
//			users.add(user);
//		}
//		
//		return users;
//	}
	public List<Doctor> showAllUsers() {
		List<Doctor> users = new ArrayList<Doctor>();
		userRep.getUser().forEach(e -> System.out.println(e));
		for (Doctor user : userRep.getUser()) {
			users.add(user);
		}
		return users;
	}

	public Optional<Doctor> editUser(int doctor_id) {
		return userRep.findById(doctor_id);
	}

	public void updateu(String username, String firstname, String lastname, String password, int doctor_id, Date dob,
			int departmentId, String address, String email, String active) {
		userRep.update(username, firstname, lastname, password, doctor_id, dob, departmentId, address, email, active);
	}

	public void deleteMyUser(int doctor_id) {
		userRep.deleteById(doctor_id);

	}

	// for patient

	public void savePatient(Patient patient) {
		patientRep.save(patient);

	}

	public Patient findByUsernameAndPassword_patient(String username, String password) {
		return patientRep.findByUsernameAndPassword(username, password);
	}

	public Optional<Patient> singlePatient(int patient_id) {
		return patientRep.findById(patient_id);
	}

	public void updatepatient(String username, String name, String password, int patient_id, Date dob, String gender,
			String address, int aadhar, String active, int pin, String phone) {
		patientRep.update(username, name, password, patient_id, dob, gender, address, aadhar, active, pin, phone);
	}

	// for department

	public List<Department> showAllDepartments() {
		List<Department> departments = new ArrayList<Department>();
		for (Department department : departmentRep.findAll()) {
			departments.add(department);
		}

		return departments;
	}

	public Optional<Department> singleDepartment(int departmentId) {
		return departmentRep.findById(departmentId);
	}

	public List<Patient> showAllPatient() {
		List<Patient> patients = new ArrayList<Patient>();
		for (Patient patient : patientRep.findAll()) {
			patients.add(patient);
		}

		return patients;
	}

	public List<Doctor> showAllDocforDep(int departmentId) {
		List<Doctor> users = new ArrayList<Doctor>();
		userRep.getUserdoc(departmentId).forEach(e -> System.out.println(e));
		for (Doctor user : userRep.getUserdoc(departmentId)) {
			users.add(user);
		}
		return users;
	}

	public void saveAppointment(Appointment appointment) {
		appointmentRep.save(appointment);

	}

	public List<Appointment> showAllAppointforPatient(int patient_id) {
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointmentRep.getAppointment(patient_id).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRep.getAppointment(patient_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}

	public void updateFeedback(String feedback, int id) {
		appointmentRep.update(feedback, id);

	}

	// for doctors service

	public List<Appointment> showAllAppointforDoc(int id) {
		List<Appointment> appointments = new ArrayList<>();
		appointmentRep.getAppointmentdoc(id).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRep.getAppointmentdoc(id)) {
			appointments.add(appointment);
		}
		return appointments;
	}

	public List<Appointment> showAllAppointforDocUpcoming(int doctor_id) {
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointmentRep.getAppointmentdocUPCOMIN(doctor_id).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRep.getAppointmentdocUPCOMIN(doctor_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}

	public List<Appointment> showAllAppointforDocPrev(int doctor_id) {
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointmentRep.getAppointmentdocPREV(doctor_id).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRep.getAppointmentdocPREV(doctor_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}

	// for doc prescription
	public void update_prescription(String prescription, int appointment_id) {
		appointmentRep.updateprescription(prescription, appointment_id);

	}

}
*/