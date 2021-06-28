import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-patient-registration',
  templateUrl: './patient-registration.component.html',
  styleUrls: ['./patient-registration.component.css']
})
export class PatientRegistrationComponent implements OnInit {
  ex: any;

  constructor(private service:NgserviceService,private router:Router) { }

  ngOnInit(): void {
  }
  submit(value:any){
    console.log(value);
    this.patient_registration(value);
    alert("successfully registered");
    this.router.navigate(['patient_login'])
    
  }

  patient_registration(value:any){
    this.service.register_patient(value).subscribe(data=>{
      this.ex=data;
      console.log(this.ex);
    })
  }

}
