package com.kush.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kush.modal.Admin;
import com.kush.modal.Appointment;
import com.kush.modal.Department;
import com.kush.modal.Patient;
import com.kush.modal.User;
import com.kush.repository.AdminRepository;
import com.kush.repository.AppointmentRepository;
import com.kush.repository.DepartmentRepository;
import com.kush.repository.PatientRepository;
import com.kush.repository.UserRepository;

@Service
@Transactional
public class UserService {
	



	private final UserRepository userRep;
	private final PatientRepository patientRep;
	private final DepartmentRepository departmentRep;
	private final AppointmentRepository appointmentRep;
	private final AdminRepository adminRep;
	
	
	public UserService(UserRepository userRep,PatientRepository patientRep,DepartmentRepository departmentRep, AppointmentRepository appointmentRep,
			AdminRepository adminRep) {
		//super();
		this.userRep = userRep;
		this.patientRep=patientRep;
		this.departmentRep=departmentRep;
		this.appointmentRep=appointmentRep;
		this.adminRep=adminRep;
	}
	
	
	
	public void saveUser(User user) {
		userRep.save(user);
		
	}
	
	public void check() {
		userRep.getUser().forEach(e->System.out.println(e));
	}
	
	public void inse() {
		userRep.insert();
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		return userRep.findByUsernameAndPassword(username, password);
	}
	
	public Admin findByUsernameAndPassword_Admin(String username, String password) {
		return adminRep.findByUsernameAndPassword(username, password);
	}

	
//	public List<User> showAllUsers(){
//		List<User> users = new ArrayList<User>();
//		for(User user : userRep.findAll()) {
//			users.add(user);
//		}
//		
//		return users;
//	}
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		userRep.getUser().forEach(e->System.out.println(e));
		for(User user : userRep.getUser()) {
			users.add(user);
		}
		return users;
	}
	
	public Optional<User> editUser(int doctor_id) {
		return userRep.findById(doctor_id);
	}
	
	public  void updateu(String username,String firstname, String lastname,String password,int doctor_id,Date dob,int department_id,String address,String email,String active) {
		  userRep.update(username,firstname,lastname, password,doctor_id,dob,department_id,address,email,active);
	}
	
	public void deleteMyUser(int doctor_id) {
		userRep.deleteById(doctor_id);
	
	}
	
	
	
	//for patient
	
	
	
	public void savePatient(Patient patient) {
		patientRep.save(patient);
		
	}
	
	public Patient findByUsernameAndPassword_patient(String username, String password) {
		return patientRep.findByUsernameAndPassword(username, password);
	}
	
	
	public Optional<Patient> singlePatient(int patient_id) {
		return patientRep.findById(patient_id);
	}
	
	public  void updatepatient(String username,String name,String password,int patient_id,Date dob,String gender,String address,int aadhar,String active,int pin,String phone) {
		  patientRep.update(username,name, password,patient_id,dob,gender,address,aadhar,active,pin,phone);
	}
	
	
	
	
	
	//for department
	
	public List<Department> showAllDepartments(){
		List<Department> departments = new ArrayList<Department>();
		for(Department department : departmentRep.findAll()) {
			departments.add(department);
		}
		
		return departments;
	}
	
	
	public Optional<Department> singleDepartment(int department_id) {
		return departmentRep.findById(department_id);
	}
	
	
	public List<Patient> showAllPatient(){
		List<Patient> patients = new ArrayList<Patient>();
		for(Patient patient : patientRep.findAll()) {
			patients.add(patient);
		}
		
		return patients;
	}
	
	
	
	
	
	
	public List<User> showAllDocforDep(int department_id){
		List<User> users = new ArrayList<User>();
		userRep.getUserdoc(department_id).forEach(e->System.out.println(e));
		for(User user : userRep.getUserdoc(department_id)) {
			users.add(user);
		}
		return users;
	}
	
	
	public void saveAppointment(Appointment appointment) {
		appointmentRep.save(appointment);
		
	}
	
	public List<Appointment> showAllAppointforPatient(int patient_id){
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointmentRep.getAppointment(patient_id).forEach(e->System.out.println(e));
		for(Appointment appointment : appointmentRep.getAppointment(patient_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}
	
	public void update_feedback(String feedback,int appointment_id) {
		appointmentRep.update(feedback, appointment_id);
		
	}
	
	//for doctors service
	
	public List<Appointment> showAllAppointforDoc(int doctor_id){
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointmentRep.getAppointmentdoc(doctor_id).forEach(e->System.out.println(e));
		for(Appointment appointment : appointmentRep.getAppointmentdoc(doctor_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}
	
	public List<Appointment> showAllAppointforDocUpcoming(int doctor_id){
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointmentRep.getAppointmentdocUPCOMIN(doctor_id).forEach(e->System.out.println(e));
		for(Appointment appointment : appointmentRep.getAppointmentdocUPCOMIN(doctor_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}
	
	public List<Appointment> showAllAppointforDocPrev(int doctor_id){
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointmentRep.getAppointmentdocPREV(doctor_id).forEach(e->System.out.println(e));
		for(Appointment appointment : appointmentRep.getAppointmentdocPREV(doctor_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}
	
	
	
	
	
	
	
	//for doc prescription
	public void update_prescription(String prescription,int appointment_id) {
		appointmentRep.updateprescription(prescription, appointment_id);
		
	}
	
	
}
