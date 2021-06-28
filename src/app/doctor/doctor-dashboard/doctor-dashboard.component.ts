import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-doctor-dashboard',
  templateUrl: './doctor-dashboard.component.html',
  styleUrls: ['./doctor-dashboard.component.css']
})
export class DoctorDashboardComponent implements OnInit {
  
  DoctorData:any;
  constructor(private service :NgserviceService,private router:Router) { 
    this.service.login_session_doctor();
 this.getUserfromLocal();
  }

  ngOnInit(): void {
  }
  getUserfromLocal()
  {
    this.DoctorData=JSON.parse(localStorage.getItem('DoctorData')!);
    console.log(this.DoctorData);

}
onlogout_doctor(){
  this.service.onlogout_doctor();
}

}
