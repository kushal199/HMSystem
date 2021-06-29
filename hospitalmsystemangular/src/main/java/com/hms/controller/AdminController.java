package com.hms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Admin;
import com.hms.entity.Doctor;
import com.hms.entity.Patient;
import com.hms.services.AdminService;
import com.hms.services.DoctorService;
import com.hms.services.PatientService;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PatientService patientService;

	// used at admin login
	@PostMapping("/login-admin")
	public Admin loginAdmin(@RequestBody Admin admin) {
		Admin admin1 = adminService.findByUsernameAndPassword(
					admin.getUsername(), admin.getPassword());
		
		return (admin1!=null)?admin1:new Admin();
	}

	// used at doctor registration
	//must add exception handelling or other constraint checks
	@PostMapping("/save")
	public int register(@RequestBody Doctor doctor) {
		System.out.println(doctor);
		doctorService.saveDoctor(doctor);
		return 1;
	}

	// used at getting single doctor for getting

	@PostMapping("/new_user")
	public Doctor editUserhh(@RequestBody int id) {
		//Doctor user = ;
		System.out.println(id);
		return doctorService.editDoctor(id);
	}
	// used for updating the doctor
	//must handle exception
	@PostMapping("/update")
	public int register1(@RequestBody Doctor doctor) {
		doctorService.update(doctor);
		return 1;
	}

	// used for delete the doctor
	//must handle exception
	@PostMapping("/delete-user")
	public int deleteUser(@RequestBody int id) {
		doctorService.deleteMyUser(id);

		return 1;
	}

	// used for viewing all doctors

	@GetMapping("/view_doc")
	public List<Doctor> viewdoc() {
		List<Doctor> list = new ArrayList<>();
		list = doctorService.showAllUsers();
		return list;
	}
	// used to view all patients

	@GetMapping("/view_patients")
	public List<Patient> viewPatients() {
		// List<Patient> list = new ArrayList<>();
		// list = patientService.showAllPatient();
		// return list;
		return patientService.showAllPatient();
	}

}
