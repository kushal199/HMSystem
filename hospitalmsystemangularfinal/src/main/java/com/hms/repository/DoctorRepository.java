package com.hms.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hms.entity.Doctor;

import java.sql.Date;
import java.util.List;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Integer> {
	
	@Query(value = "SELECT * FROM doctor", nativeQuery = true)
	public List<Doctor> getUser();
	
	public Doctor findByUsernameAndPassword(String username, String password);

	//public User findOne(int id);
	
	@Query(value = "SELECT COUNT(doctor_id) FROM doctor WHERE username=:username", nativeQuery = true)
	public int getDoctorCount(@Param("username") String username);
	
	@Modifying
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Query(value="update doctor set username=:username ,firstname=:firstName , lastname=:lastName,password=:password,dob=:dob,department_id=:departmentId,address=:address,email=:email,active=:active where doctor_id=:doctorId" ,nativeQuery=true)
	public void update(@Param("username") String username,@Param("firstName") String firstName,@Param("lastName") String lastName,@Param("password") String password,@Param("dob") Date dob,@Param("departmentId") int departmentId,@Param("address") String address,@Param("email") String email
	,@Param("active") String active,@Param("doctorId") int doctorId);
	
	
	//patient
	
	@Query(value = "SELECT * FROM doctor where department_id=:departmentId", nativeQuery = true)
	public List<Doctor> getUserdoc(@Param("departmentId") int departmentId);

}
