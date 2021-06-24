package com.kush.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.kush.modal.Patient;
import com.kush.modal.User;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
	
	public Patient findByUsernameAndPassword(String username, String password);
	
	
	
	@Query(value = "SELECT * FROM patient", nativeQuery = true)
	public List<Patient> getPatient();
	
	
	@Modifying
	@Query(value="update patient set username=:username, name=:name, pin=:pin, password=:password, dob=:dob, gender=:gender, address=:address , phone=:phone, active=:active, aadhar=:aadhar where patient_id=:patient_id" ,nativeQuery=true)
	public void update(@Param("username") String username,@Param("name") String name,@Param("password") String password,@Param("patient_id")
	int patient_id,@Param("dob") Date dob,@Param("gender") String gender,@Param("address") String address,@Param("aadhar") int aadhar
	,@Param("active") String active,@Param("pin") int pin,@Param("phone") String phone);

}
