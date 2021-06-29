package com.hms.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Appointment;
import com.hms.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	public void saveAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);

	}

	public List<Appointment> showAllAppointforPatient(int patientId) {
		List<Appointment> appointments = new ArrayList<>();
		appointmentRepository.getAppointment(patientId).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRepository.getAppointment(patientId)) {
			appointments.add(appointment);
		}
		return appointments;
	}

	public void updateFeedback(String feedback, int id) {
		appointmentRepository.update(feedback, id);

	}
	public List<Appointment> showAllAppointforDoc(int id) {
		List<Appointment> appointments = new ArrayList<>();
		appointmentRepository.getAppointmentdoc(id).forEach(e -> System.out.println(e));
		for (Appointment appointment : appointmentRepository.getAppointmentdoc(id)) {
			appointments.add(appointment);
		}
		return appointments;
	}

}
