package com.hms.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Appointment;
import com.hms.entity.Doctor;
import com.hms.repository.AppointmentRepository;
import com.hms.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private AppointmentRepository appointmentRepository;

	public void saveDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
	}

	public void check() {
		doctorRepository.getUser().forEach(e -> System.out.println(e));
	}


	public Doctor findByUsernameAndPassword(String username, String password) {
		return doctorRepository.findByUsernameAndPassword(username, password);
	}

	public List<Doctor> showAllUsers() {
		List<Doctor> users = new ArrayList<>();
		doctorRepository.getUser().forEach(e -> System.out.println(e));
		for (Doctor user : doctorRepository.getUser()) {
			users.add(user);
		}
		return users;
	}

	public Doctor editDoctor(int id) {
		return doctorRepository.findById(id).orElse(new Doctor());
	}

	public void update(Doctor doctor) {
		doctorRepository.update(doctor.getUsername(),doctor.getFirstName(),
				doctor.getLastName(), doctor.getPassword(),
				doctor.getDob(),doctor.getDepartmentId(),doctor.getAddress(),
				doctor.getEmail(),doctor.getActive(),doctor.getDoctorId());
	}

	public void deleteMyUser(int id) {
		doctorRepository.deleteById(id);

	}

	public List<Doctor> showAllDocforDep(int id) {
		List<Doctor> users = new ArrayList<>();
		doctorRepository.getUserdoc(id).forEach(e -> System.out.println(e));
		for (Doctor user : doctorRepository.getUserdoc(id)) {
			users.add(user);
		}
		return users;
	}
	
	public List<Appointment> showAllAppointforDoc(int id) {
		List<Appointment> appointments = new ArrayList<>();
		appointmentRepository.getAppointmentdoc(id).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRepository.getAppointmentdoc(id)) {
			appointments.add(appointment);
		}
		return appointments;
	}
	public List<Appointment> showAllAppointforDocUpcoming(int doctor_id) {
		List<Appointment> appointments = new ArrayList<>();
		appointmentRepository.getAppointmentdocUPCOMIN(doctor_id).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRepository.getAppointmentdocUPCOMIN(doctor_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}
	public List<Appointment> showAllAppointforDocPrev(int doctor_id) {
		List<Appointment> appointments = new ArrayList<>();
		appointmentRepository.getAppointmentdocPREV(doctor_id).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRepository.getAppointmentdocPREV(doctor_id)) {
			appointments.add(appointment);
		}
		return appointments;
	}
	// for doc prescription
	public void updatePrescription(String prescription, int appointment_id) {
		appointmentRepository.updateprescription(prescription, appointment_id);
	}
	public String checkUniqueUsername(String username) {
		return (doctorRepository.getDoctorCount(username)==0)?"yes":"no";
	}
}
