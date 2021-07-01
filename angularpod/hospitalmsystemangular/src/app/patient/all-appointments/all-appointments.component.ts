import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-all-appointments',
  templateUrl: './all-appointments.component.html',
  styleUrls: ['./all-appointments.component.css']
})
export class AllAppointmentsComponent implements OnInit {
  users!: any[];
  patient_id:any;

  constructor(private route:ActivatedRoute,private service:NgserviceService,private router:Router) {
   this.service.login_session();
   this.patient_id=Number(this.route.snapshot.params['patient_id']);
   this.getAppointMentsForPatient(this.patient_id);
   }

  ngOnInit(): void {
  }

   //getting appointments for patient which they took as appointment
 getAppointMentsForPatient(patient_id:any){
   this.service.fetchappointmentForPatientdetails(patient_id).subscribe(data=>{
   this.users=data;
   console.log(data);
   });
 }

 //redirect route to feedbackform with id
 getfeedbackform(appointment_id:any){
  this.router.navigate(['feedbackform',appointment_id]);
 }

 
 onlogout(){
   this.service.onlogout();
 }

}
