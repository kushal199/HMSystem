package com.hms.services;

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

	public Patient login(Patient p) {
		return patientRepository.findById(p.getPatient_id()).orElse(null);
	}

	public void savePatient(Patient patient) {
		patient.setActive("yes");
		patientRepository.save(patient);

	}

	public Patient findByUsernameAndPassword(String username, String password) {
		Patient patient = patientRepository.findByUsernameAndPassword(username, password);
		return (patient != null) ? patient : new Patient();
	}

	public Optional<Patient> singlePatient(int id) {
		return patientRepository.findById(id);
	}

	public void updatepatient(Patient patient) {
		patientRepository.update(patient.getUsername(), patient.getName(), patient.getPassword(),
				patient.getPatient_id(), patient.getDob(), patient.getGender(), patient.getAddress(),
			patient.getActive(), patient.getPin(), patient.getPhone());
	}

	public List<Patient> showAllPatient() {

		return (List<Patient>) patientRepository.findAll();
	}

	public String checkUniqueUsername(String username) {
		return (patientRepository.getPatientCountUsername(username) == 0) ? "yes" : "no";
	}

	public String checkUniqueAadhaar(String aadhaar) {
		return (patientRepository.getPatientCountAadhaar(aadhaar) == 0) ? "yes" : "no";
	}
}
