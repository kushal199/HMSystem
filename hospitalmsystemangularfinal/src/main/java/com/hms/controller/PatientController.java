package com.hms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Appointment;
import com.hms.entity.Department;
import com.hms.entity.Doctor;
import com.hms.entity.Patient;
import com.hms.services.AppointmentService;
import com.hms.services.DepartmentService;
import com.hms.services.DoctorService;
import com.hms.services.PatientService;

@RestController
@CrossOrigin(origins = "*")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private AppointmentService appointmentService;

	// used for register patient

	@PostMapping("/save_patient")
	public int registerPatient(@RequestBody Patient patient) {

		patientService.savePatient(patient);

		return 1;
	}

	// used for logging in patient

	@PostMapping("/login_patient")
	public Patient loginPatient(@RequestBody Patient patient) {
		return patientService.findByUsernameAndPassword(patient.getUsername(), patient.getPassword());

	}

	// used for update the patient

	@PostMapping("/update_patient")
	public int updatePatient(@RequestBody Patient patient) {
		System.out.println(patient);
		patientService.updatepatient(patient);
		return 1;

	}

	// used for view all departments

	@GetMapping("/view_department")
	public List<Department> viewdep() {
		// List<Department> list = new ArrayList<Department>();
		// list = departmentService.showAllDepartments();
		return departmentService.showAllDepartments();
	}
	// used for getting doctors for each department

	@PostMapping("/doctorfordep")
	public List<Doctor> viewdocfordep(@RequestBody int departmentId) {
		
		List<Doctor> list = new ArrayList<Doctor>();
		list = doctorService.showAllDocforDep(departmentId);
		System.out.println(doctorService.showAllDocforDep(departmentId));
		return list;
	}
	// used for saving appointment

	@PostMapping("/save_appointment")
	public int appointmentSave(@RequestBody Appointment appointment) {

		Appointment appointment1 = new Appointment(appointment.getAppointmentId(), appointment.getPatientId(),
				appointment.getDoctorId(), appointment.getDatetime(), "", appointment.getDescription(), "");
		appointmentService.saveAppointment(appointment1);
		return 1;

	}
	// used for getting appointments for each patient

	@PostMapping("/appointments")
	public List<Appointment> showAppointments(@RequestBody int patient_id) {

		List<Appointment> list = new ArrayList<>();
		list = appointmentService.showAllAppointforPatient(patient_id);
		return list;
	}
	// used to push feedback to database

	@PostMapping("/update_feedback")
	public int feedbackPush(@RequestBody Appointment appointment) {

		appointmentService.updateFeedback(appointment.getFeedback(), appointment.getAppointmentId());

		return 1;
	}
	//uniqueness check
	@PostMapping("/patient/check_username")
	public int checkUniqueUsername(@RequestBody String username) {
		System.out.println(username);
		//return patientService.checkUniqueUsername(username);
	     if(patientService.checkUniqueUsername(username)=="yes") {
	    	 return 1;
	     }else {
	    	 return 0;
	     }
		
		}

	@PostMapping("/patient/check_aadhaar")
	public String checkUniqueAadhaar(@RequestBody String aadhaar) {
		return patientService.checkUniqueAadhaar(aadhaar);
	}
	
}