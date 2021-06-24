package com.kush.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	private int department_id;
	private String name;
	private String description;
	public Department() {
		
	}
	public Department(int department_id, String name,String description) {
		super();
		this.department_id = department_id;
		this.name = name;
		this.description=description;
		}
	
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
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
	
	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", name=" + name + "]";
	}
}
