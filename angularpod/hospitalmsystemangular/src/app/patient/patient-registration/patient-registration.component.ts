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
  usernameChecker: any;
 

  constructor(private service:NgserviceService,private router:Router) { }

  ngOnInit(): void {
  }

  //submitting registration form and call respecting method and after registering route to login page
  submit(value:any){
    console.log(value);
    this.patient_registration(value);
    alert("successfully registered");
    this.router.navigate(['patient_login'])
  }

  //to save patient calling service method to register
  patient_registration(value:any){
    this.service.register_patient(value).subscribe(data=>{
    this.ex=data;
    console.log(this.ex);
    })
  }
  checkUsername(event:any){
    console.log(event.target.value);
    const c=event.target.value;
    this.service.checkPatientUsername(c).subscribe(data1=>{
      this.service.checkDoctorUsername(c).subscribe(data2=>{
        if(data1 ==1 && data2 ==1){
          this.usernameChecker=false;
        }else{
          this.usernameChecker=true;
        }
  
      })
     console.log(this.usernameChecker);
     console.log(event.target.value);

    });
   
    
  }

}
