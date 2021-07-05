package com.hms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Admin;
import com.hms.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	public Admin findByUsernameAndPassword(String username, String password) {
		return adminRepository.findByUsernameAndPassword(username, password);
	}
}
