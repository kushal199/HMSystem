import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-doctor-appointments',
  templateUrl: './doctor-appointments.component.html',
  styleUrls: ['./doctor-appointments.component.css']
})
export class DoctorAppointmentsComponent implements OnInit {
  users!: any[];
  prevapp!:any[];
  DoctorData:any;
  constructor(private service:NgserviceService,private router:Router) { 
    this.service.login_session_doctor();
    this.getUserfromLocal();
    this.getAllUpcomingAppointments(this.DoctorData.doctor_id);
    this.getAllPrevAppointments(this.DoctorData.doctor_id);

  }

  ngOnInit(): void {
  }
  //take doc id as input and fetching upcoming appointments
  getAllUpcomingAppointments(doctor_id:any){
    console.log(doctor_id);
   this.service.fetchappointmentForUpcoming(doctor_id).subscribe(data=>{
    this.users=data;
    console.log(this.users);
   });
  }

  //getting all prev appointments
  getAllPrevAppointments(doctor_id:any){
    console.log(doctor_id);
   this.service.fetchappointmentForPrev(doctor_id).subscribe(data=>{
    this.prevapp=data;
    console.log(this.prevapp);
   });
  }

  //getting user from local storage
  getUserfromLocal()
  {
    this.DoctorData=JSON.parse(localStorage.getItem('DoctorData')!);
    console.log(this.DoctorData);

}


getprescriptionForm(appointment_id:any){
  this.router.navigate(['prescriptionform',appointment_id]);
}


onlogout_doctor(){
  this.service.onlogout_doctor();
}

}
