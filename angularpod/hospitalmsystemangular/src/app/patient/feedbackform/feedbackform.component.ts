import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-feedbackform',
  templateUrl: './feedbackform.component.html',
  styleUrls: ['./feedbackform.component.css']
})
export class FeedbackformComponent implements OnInit {
  ex:any;
  PatientData:any;
  appointmentId:any;
  patientId: any;

  constructor(private service:NgserviceService,private router:Router,private route:ActivatedRoute) { 
  this.service.login_session();
  this.getUserfromLocal();
  this.appointmentId=this.route.snapshot.params['appointmentId'];
  }

  ngOnInit(): void {
  }

  //submitting feedback form
  submit(value:any){
    console.log(value);
    this.updateDetails(value);
  }

  //to call the updatefeedback from service to connect with controller 
  updateDetails(value:any){
     this.service.updatefeedback(value).subscribe(data=>{
     this.ex=data;
     console.log(this.ex);
     this.patientId=this.PatientData.patientId;
     this.router.navigate(['allappointments',this.patientId])
    });
  }

  //getting user from localStorage
  getUserfromLocal()
  {
    this.PatientData=JSON.parse(localStorage.getItem('PatientData')!);
    console.log(this.PatientData);
}


onlogout(){
  this.service.onlogout();
}

}
