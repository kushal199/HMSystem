import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-edit-doctor',
  templateUrl: './edit-doctor.component.html',
  styleUrls: ['./edit-doctor.component.css']
})
export class EditDoctorComponent implements OnInit {
 user:any;
 ex:any;

  constructor(private service:NgserviceService,private router:Router) {
   service.login_session_doctor();
   this.getUserDetails();
   }

  ngOnInit(): void {
  }
  
//submit form and update doctor ..
 submit(value:any){
  console.log(value);
  this.service.doctor_update(value).subscribe(data=>{
  this.ex=data;
  console.log(this.ex);
  alert("updated...please logout and login again to see updated result");
  this.router.navigate(['doctor_dashboard']);
 });
  }

  //get user details from localstorage
  getUserDetails(){
    this.user=JSON.parse(localStorage.getItem('DoctorData')!);
    console.log(this.user);
  }

  onlogout_doctor(){
    this.service.onlogout_doctor();
  }
}
