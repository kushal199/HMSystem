import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-edit-patient',
  templateUrl: './edit-patient.component.html',
  styleUrls: ['./edit-patient.component.css']
})
export class EditPatientComponent implements OnInit {
  user: any;
  ex: any;

  constructor(private service:NgserviceService,private router:Router) { 
   this.getlocalUser();
  }

  ngOnInit(): void {
  }

  //submitting form to update and taking form object and calling patient update to connect api
  submit(value:any){
  console.log(value);
  this.service.patient_update(value).subscribe(data=>{
  this.ex=data;
  console.log(this.ex);
  alert(this.ex + "  true " +"logout and login again");
  this.router.navigate(['departments']);
   });
  }

  //getting storage from localStorage
  getlocalUser(){
    this.user=JSON.parse(localStorage.getItem('PatientData')!);
    console.log(this.user);
  }

  
  onlogout_patient(){
    this.service.onlogout();
  }
}
