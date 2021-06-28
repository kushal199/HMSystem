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
  appointment_id:any;
  patient_id: any;
  constructor(private service:NgserviceService,private router:Router,private route:ActivatedRoute) { 
    this.service.login_session();
  this.getUserfromLocal();
  this.appointment_id=this.route.snapshot.params['appointment_id'];
  }

  ngOnInit(): void {
  }

  submit(value:any){
    console.log(value);
    this.updateDetails(value);
  }

  updateDetails(value:any){
    this.service.updatefeedback(value).subscribe(data=>{
     this.ex=data;
     console.log(this.ex);
     this.patient_id=this.PatientData.patient_id;
     this.router.navigate(['allappointments',this.patient_id])
    });
  }

  getUserfromLocal()
  {
    this.PatientData=JSON.parse(localStorage.getItem('PatientData')!);
    console.log(this.PatientData);

}
onlogout(){
  this.service.onlogout();
}

}
