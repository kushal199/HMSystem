package com.hms.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Department;
import com.hms.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> showAllDepartments() {
		List<Department> departments = new ArrayList<>();
		for (Department department : departmentRepository.findAll()) {
			departments.add(department);
		}

		return departments;
	}

	public Optional<Department> singleDepartment(int id) {
		return departmentRepository.findById(id);
	}
}
