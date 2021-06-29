package com.hms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Appointment;
import com.hms.entity.Doctor;
import com.hms.services.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	// used at doctor login

	@PostMapping("/login-user")
	public Doctor loginUser(@RequestBody Doctor user) {
		if (doctorService.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			Doctor user1 = new Doctor();
			user1 = doctorService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
			return user1;
		}

		return new Doctor();
	}
	// used for getting appointments for doctor

	@PostMapping("/appointmentsForDoc")
	public List<Appointment> showAppointmentsForDoc(@RequestBody int doctorId) {

		List<Appointment> list = new ArrayList<>();
		list = doctorService.showAllAppointforDoc(doctorId);
		return list;
	}
	// used for fetching upcoming appointments for doctors

	@PostMapping("/appointmentsForDocUpcoming")
	public List<Appointment> showAppointmentsForDocUpcoming(@RequestBody int doctorId) {
		List<Appointment> list = new ArrayList<>();
		list = doctorService.showAllAppointforDocUpcoming(doctorId);
		return list;
	}

	// used for fetching previous appointment for doctor

	@PostMapping("/appointmentsForDocPrev")
	public List<Appointment> showAppointmentsForDocPrev(@RequestBody int doctorId) {

		List<Appointment> list = new ArrayList<>();
		list = doctorService.showAllAppointforDocPrev(doctorId);
		return list;
	}
	// used to prescribe from doctor

	@PutMapping("/update_prescription")
	public int prescriptionPush(@RequestBody Appointment appointment) {
		doctorService.updatePrescription(appointment.getPrescription(), appointment.getAppointmentId());
		return 1;
	}
}
