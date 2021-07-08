package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	public Admin findByUsernameAndPassword(String username, String password);
}
