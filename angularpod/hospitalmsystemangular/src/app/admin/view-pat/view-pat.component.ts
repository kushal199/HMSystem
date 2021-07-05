import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-view-pat',
  templateUrl: './view-pat.component.html',
  styleUrls: ['./view-pat.component.css']
})
export class ViewPatComponent implements OnInit {
  users!: any[];

  constructor(private router:Router,private service:NgserviceService) {
    this.login_session();
    this.getPatient();
   }


  ngOnInit(): void {
  }

  //getting patient list calling service
  getPatient(){
    this.service.fetchPatientdetails().subscribe(data=>{
    this.users=data;
    });
  }


  onlogout(){
    localStorage.removeItem('UserData');
    this.router.navigate(['loginpage']);
  }

  //session checking if available or not
  login_session(){
    const userData=JSON.parse(localStorage.getItem('UserData')!);
    if(!userData){
      this.router.navigate(['loginpage']);
    }
  }

}
