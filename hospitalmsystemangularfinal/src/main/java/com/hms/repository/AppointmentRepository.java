package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hms.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
	@Query(value = "SELECT * FROM appointment where patient_id=:patientId", nativeQuery = true)
	public List<Appointment> getAppointment(@Param("patientId") int patientId);

	@Query(value = "SELECT * FROM appointment where doctor_id=:doctorId", nativeQuery = true)
	public List<Appointment> getAppointmentdoc(@Param("doctorId") int doctorId);

	@Query(value = "SELECT * FROM appointment where doctor_id=:doctorId and datetime > CURDATE()", nativeQuery = true)
	public List<Appointment> getAppointmentdocUPCOMIN(@Param("doctorId") int doctorId);

	@Query(value = "SELECT * FROM appointment where doctor_id=:doctorId and datetime < CURDATE()", nativeQuery = true)
	public List<Appointment> getAppointmentdocPREV(@Param("doctorId") int doctorId);

	@Modifying
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Query(value = "update appointment set feedback=:feedback where appointment_id=:appointmentId", nativeQuery = true)
	public void update(@Param("feedback") String feedback, @Param("appointmentId") int appointmentId);

	@Modifying
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Query(value = "update appointment set prescription=:prescription where appointment_id=:appointmentId", nativeQuery = true)
	public void updateprescription(@Param("prescription") String prescription,
			@Param("appointmentId") int appointmentId);

}