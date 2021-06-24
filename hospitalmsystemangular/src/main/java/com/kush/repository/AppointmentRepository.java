package com.kush.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.kush.modal.Appointment;
//import com.kush.modal.User;

public interface AppointmentRepository  extends CrudRepository<Appointment, Integer>{
	
	@Query(value = "SELECT * FROM appointment where patient_id=:patient_id", nativeQuery = true)
	public List<Appointment> getAppointment(@Param("patient_id") int patient_id);
	
	
	@Query(value = "SELECT * FROM appointment where doctor_id=:doctor_id", nativeQuery = true)
	public List<Appointment> getAppointmentdoc(@Param("doctor_id") int doctor_id);
	
	@Query(value = "SELECT * FROM appointment where doctor_id=:doctor_id and datetime > CURDATE()", nativeQuery = true)
	public List<Appointment> getAppointmentdocUPCOMIN(@Param("doctor_id") int doctor_id);
	
	@Query(value = "SELECT * FROM appointment where doctor_id=:doctor_id and datetime < CURDATE()", nativeQuery = true)
	public List<Appointment> getAppointmentdocPREV(@Param("doctor_id") int doctor_id);
	
	
	@Modifying
	@Query(value="update appointment set feedback=:feedback where appointment_id=:appointment_id" ,nativeQuery=true)
	public void update(@Param("feedback") String feedback,@Param("appointment_id") int appointment_id);
	
	
	@Modifying
	@Query(value="update appointment set prescription=:prescription where appointment_id=:appointment_id" ,nativeQuery=true)
	public void updateprescription(@Param("prescription") String prescription,@Param("appointment_id") int appointment_id);

}


