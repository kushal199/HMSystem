package com.hms.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hms.entity.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {

	public Patient findByUsernameAndPassword(String username, String password);

	@Query(value = "SELECT * FROM patient", nativeQuery = true)
	public List<Patient> getPatient();

	@Query(value = "SELECT COUNT(patient_id) FROM patient WHERE username=:username", nativeQuery = true)
	public int getPatientCountUsername(@Param("username") String username);
	
	@Query(value = "SELECT COUNT(patient_id) FROM patient WHERE aadhaar=:aadhaar", nativeQuery = true)
	public int getPatientCountAadhaar(@Param("aadhaar") String aadhaar);
	
	@Modifying
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Query(value = "update patient set username=:username, name=:name, pin=:pin, password=:password, dob=:dob, gender=:gender, address=:address , phone=:phone, active=:active where patient_id=:patientId", nativeQuery = true)
	public void update(@Param("username") String username, @Param("name") String name,
			@Param("password") String password, @Param("patientId") int id, @Param("dob") Date dob,
			@Param("gender") String gender, @Param("address") String address,
			@Param("active") String active, @Param("pin") int pin, @Param("phone") String phone);

}
