import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-prescriptionform',
  templateUrl: './prescriptionform.component.html',
  styleUrls: ['./prescriptionform.component.css']
})
export class PrescriptionformComponent implements OnInit {
   appointment_id:any;
   DoctorData:any;
   ex:any;
  constructor(private service:NgserviceService,private router:Router,private route:ActivatedRoute) {
    this.service.login_session_doctor();
   this.appointment_id=Number(this.route.snapshot.params['appointment_id']);
   this.getUserfromLocal();
   
   }

  ngOnInit(): void {
  }

  //submit and call respective service
  submit(value:any){
    console.log(value);
    this.service.updateprescription(value).subscribe(data=>{
    this.ex=data;
    console.log(this.ex);
    this.router.navigate(['doctor_appointments']);
    });
  }

  //getting user from localstorage
  getUserfromLocal()
  {
    this.DoctorData=JSON.parse(localStorage.getItem('DoctorData')!);
    console.log(this.DoctorData);

}
onlogout_doctor(){
  this.service.onlogout_doctor();
}

}
