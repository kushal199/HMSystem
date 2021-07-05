package com.hms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
