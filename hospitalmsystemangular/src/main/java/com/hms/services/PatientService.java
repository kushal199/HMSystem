package com.hms.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Patient;
import com.hms.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private DoctorService doctorService;
	

	public Patient login(Patient p) {
		return patientRepository.findById(p.getPatientId()).orElse(null);
	}
	public void savePatient(Patient patient) {
		patientRepository.save(patient);
		
	}
	public Patient findByUsernameAndPassword(String username, String password) {
		Patient patient=patientRepository.findByUsernameAndPassword(username, password);
		return (patient!=null)?patient:new Patient();
	}
	
	
	public Optional<Patient> singlePatient(int id) {
		return patientRepository.findById(id);
	}
	
	public  void updatepatient(Patient patient) {
		  patientRepository.update(patient.getUsername(), patient.getName(), patient.getPassword(),
					patient.getPatientId(), patient.getDob(), patient.getGender(), patient.getAddress(),
					patient.getAadhaar(), patient.getActive(), patient.getPin(), patient.getPhone());
	}
	public List<Patient> showAllPatient(){
		
		return (List<Patient>) patientRepository.findAll();
	}
}
