package com.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="department_id")
	private int departmentId;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	public Department() {
		
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Department(int departmentId, String name, String description) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", description=" + description + "]";
	}
	
	

}
