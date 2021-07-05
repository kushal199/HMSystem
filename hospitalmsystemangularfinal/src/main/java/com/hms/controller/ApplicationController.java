/*package com.hms.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;

//import javax.swing.text.html.HTML;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.customRepo.Repo;
import com.hms.entity.Admin;
import com.hms.entity.Appointment;
import com.hms.entity.Department;
import com.hms.entity.Patient;
import com.hms.entity.Doctor;
import com.hms.repository.DoctorRepository;
import com.hms.services.UserService;

@RestController
public class ApplicationController {
	@Autowired
	private UserService userService;
	@Autowired
	Repo repo;
	
	
	    //used at doctor registration	
		
	            @RequestMapping(value="/save",method=RequestMethod.POST)
				@CrossOrigin(origins="http://localhost:4200")
				public int register(@RequestBody Doctor user)
				{
					System.out.println(user);
					userService.saveUser(user);
					return 1;
			    }
		
		
				
		//	used at admin login
	
		@RequestMapping (value="/login-admin",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public Admin loginAdmin(@RequestBody Admin admin) {
			if(userService.findByUsernameAndPassword_Admin(admin.getUsername(), admin.getPassword())!=null) {
				Admin admin1=new Admin();
				admin1=userService.findByUsernameAndPassword_Admin(admin.getUsername(), admin.getPassword());
				return admin1;
			}
			
			return new Admin();
		}
		
		
		//used at doctor login
		
		@RequestMapping (value="/login-user",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public Doctor loginUser(@RequestBody Doctor user) {
			if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
				Doctor user1=new Doctor();
				user1=userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
				return user1;
			}
			
			return new Doctor();
		}
		
		
	    //used at getting single doctor
		
		
		@RequestMapping(value="/new_user",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public Doctor editUserhh(@RequestBody int id) {
			Doctor user =(userService.editUser(id)).get();
			return user;
		}
		
		

		//used for updating the doctor
		
		@RequestMapping(value="/update",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public int register1(@RequestBody Doctor user)
		{
			userService.updateu(user.getUsername(),user.getfirstname(),user.getlastname(), user.getPassword(),user.getdoctor_id(),user.getDob(),user.getdepartmentId(),user.getAddress(),user.getEmail(),user.getActive());
			
			return 1;
				
		    }
		
		
		
		//used for delete the doctor
		
		@RequestMapping(value="/delete-user",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public int deleteUser(@RequestBody int id) {
			userService.deleteMyUser(id);
			
			return 1;
		}
		
		
		
		
		//used for viewing all doctors
		
		@RequestMapping(value="/view_doc",method=RequestMethod.GET)
		@CrossOrigin(origins="http://localhost:4200")
		public List<Doctor> viewdoc() {
		    List<Doctor> list = new ArrayList<Doctor>();
			list= userService.showAllUsers();
			return list;
	}
		
		
		
		//for patient
		
	
		//used for register patient
		
		
		@RequestMapping(value="/save_patient",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public int register_patient(@RequestBody Patient patient)
		{
			
			userService.savePatient(patient);
			
			return 1;
	    }
		
		
		//used for logging in patient
		
		@RequestMapping (value="/login_patient",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public Patient login_patient(@RequestBody Patient patient) {
			if(userService.findByUsernameAndPassword_patient(patient.getUsername(), patient.getPassword())!=null) {
				Patient patient1=new Patient();
				patient1=userService.findByUsernameAndPassword_patient(patient.getUsername(), patient.getPassword());
				return patient1;
			}
			else {
				
				Patient patient2=new Patient();
				return patient2;
			}
		}
		
		
		//used for update the patient
		
		@RequestMapping(value="/update_patient",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public int update_Patient(@RequestBody Patient patient)
		
		{
			System.out.println(patient);
			userService.updatepatient(patient.getUsername(),patient.getName(),patient.getPassword(), patient.getpatient_id(),patient.getDob(),patient.getGender(),patient.getAddress(),patient.getAadhar(),patient.getActive(),patient.getPin(),patient.getPhone());
			return 1;
				
		    }
		
		//used for view all departments
		
		@RequestMapping(value="/view_department",method=RequestMethod.GET)
		@CrossOrigin(origins="http://localhost:4200")
		public List<Department> viewdep() {
		    List<Department> list = new ArrayList<Department>();
			list= userService.showAllDepartments();
			return list;
	}
		
		
		//used for getting single department
		
		@RequestMapping(value="/single_department",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public Department single_department(@RequestBody int id) {
			Department department =(userService.singleDepartment(id)).get();
			
			return department;
		}
		
		//used to view all patients
		
		@RequestMapping(value="/view_patients",method=RequestMethod.GET)
		@CrossOrigin(origins="http://localhost:4200")
		public List<Patient> viewPatients() {
		    List<Patient> list = new ArrayList<Patient>();
			list= userService.showAllPatient();
			return list;
	}
		
        //used for getting doctors for each department
		
		@RequestMapping(value="/doctorfordep",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public List<Doctor> viewdocfordep(@RequestBody int departmentId) {
			//m.addAttribute("users", userService.showAllDocforDep(id));
			//m.addAttribute("patient_id",idd);
			List<Doctor> list = new ArrayList<Doctor>();
			list=userService.showAllDocforDep(departmentId);
			System.out.println(userService.showAllDocforDep(departmentId));
			return list;
	}
		

		//used for saving appointment
		
		@RequestMapping(value="/save_appointment",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public int appointment_save(@RequestBody Appointment appointment) {

			Appointment appointment1=new Appointment(appointment.getpatient_id(),appointment.getdoctor_id(),appointment.getDatetime(),"",appointment.getDescription(),"");
			userService.saveAppointment(appointment1);
			return 1;
			
			
			
	}
		
		//used for getting appointments for each patient

		@RequestMapping(value="/appointments",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public List<Appointment> showAppointments(@RequestBody int patient_id) {
			
			List<Appointment> list = new ArrayList<Appointment>();
			list=userService.showAllAppointforPatient(patient_id);
			return list;
	}
		
		//used for getting appointments for doctor
		
		@RequestMapping(value="/appointmentsForDoc",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public List<Appointment> showAppointmentsForDoc(@RequestBody int doctor_id) {
			
			List<Appointment> list = new ArrayList<Appointment>();
			list=userService.showAllAppointforDoc(doctor_id);
			return list;
	}
		
		
		//used for fetching upcoming appointments for doctors
		
		@RequestMapping(value="/appointmentsForDocUpcoming",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public List<Appointment> showAppointmentsForDocUpcoming(@RequestBody int doctor_id) {
			
			List<Appointment> list = new ArrayList<Appointment>();
			list=userService.showAllAppointforDocUpcoming(doctor_id);
			return list;
	}
		
		//used for fetching previous appointment for doctor
		
		@RequestMapping(value="/appointmentsForDocPrev",method=RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public List<Appointment> showAppointmentsForDocPrev(@RequestBody int doctor_id) {
			
			List<Appointment> list = new ArrayList<Appointment>();
			list=userService.showAllAppointforDocPrev(doctor_id);
			return list;
	}
		
		
		
		//used to push feedback to database
		
		@RequestMapping(value="/update_feedback" ,method = RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public int feedback_push(@RequestBody Appointment appointment) {
			
			userService.update_feedback(appointment.getFeedback(), appointment.getpatient_id());

			return 1;
	}
		
		//used to prescribe from doctor
		
		@RequestMapping(value="/update_prescription" ,method = RequestMethod.POST)
		@CrossOrigin(origins="http://localhost:4200")
		public int prescription_push(@RequestBody Appointment appointment) {
			userService.update_prescription(appointment.getPrescription(), appointment.getappointment_id());
			return 1;
	}
		
		
		
		
}



	

	*/

