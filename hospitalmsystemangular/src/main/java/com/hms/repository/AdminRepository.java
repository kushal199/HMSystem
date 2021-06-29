package com.hms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.entity.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
	
	public Admin findByUsernameAndPassword(String username, String password);
}
