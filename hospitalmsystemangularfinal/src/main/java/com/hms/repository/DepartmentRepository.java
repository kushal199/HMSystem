package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
