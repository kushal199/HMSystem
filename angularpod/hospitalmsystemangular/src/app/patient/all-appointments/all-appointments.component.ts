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
  patientId:any;

  constructor(private route:ActivatedRoute,private service:NgserviceService,private router:Router) {
   this.service.login_session();
   this.patientId=Number(this.route.snapshot.params['patientId']);
   this.getAppointMentsForPatient(this.patientId);
   }

  ngOnInit(): void {
  }

   //getting appointments for patient which they took as appointment
 getAppointMentsForPatient(patientId:any){
   this.service.fetchappointmentForPatientdetails(patientId).subscribe(data=>{
   this.users=data;
   console.log(data);
   });
 }

 //redirect route to feedbackform with id
 getfeedbackform(appointmentId:any){
  this.router.navigate(['feedbackform',appointmentId]);
 }

 
 onlogout(){
   this.service.onlogout();
 }

}
