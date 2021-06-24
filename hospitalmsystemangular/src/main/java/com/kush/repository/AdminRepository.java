package com.kush.repository;

import org.springframework.data.repository.CrudRepository;

import com.kush.modal.Admin;
import com.kush.modal.Patient;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	
	public Admin findByUsernameAndPassword(String username, String password);
}
