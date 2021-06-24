package com.kush.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.kush.modal.User;

import java.sql.Date;
import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
	
	@Query(value = "SELECT * FROM doctor", nativeQuery = true)
	public List<User> getUser();
	
	@Modifying
	@Query(value = "insert into doctor(firstname,lastname,username,password) values('s','k','l','o')", nativeQuery = true)
	public void insert();
	
	public User findByUsernameAndPassword(String username, String password);

	//public User findOne(int id);
	
	@Modifying
	@Query(value="update doctor set username=:username ,firstname=:firstname , lastname=:lastname,password=:password,dob=:dob,department_id=:department_id,address=:address,email=:email,active=:active where doctor_id=:doctor_id" ,nativeQuery=true)
	public void update(@Param("username") String username,@Param("firstname") String firstname,@Param("lastname") String lastname,@Param("password") String password,@Param("doctor_id")
	int doctor_id,@Param("dob") Date dob,@Param("department_id") int department_id,@Param("address") String address,@Param("email") String email
	,@Param("active") String active);
	
	
	//patient
	
	@Query(value = "SELECT * FROM doctor where department_id=:department_id", nativeQuery = true)
	public List<User> getUserdoc(@Param("department_id") int department_id);

}
