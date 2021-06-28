package com.hms.repository;

import org.springframework.data.repository.CrudRepository;

import com.hms.modal.Admin;
import com.hms.modal.Patient;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	
	public Admin findByUsernameAndPassword(String username, String password);
}
