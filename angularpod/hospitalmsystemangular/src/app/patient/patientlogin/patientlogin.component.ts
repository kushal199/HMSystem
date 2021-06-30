import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { timer } from 'rxjs';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-patientlogin',
  templateUrl: './patientlogin.component.html',
  styleUrls: ['./patientlogin.component.css']
})
export class PatientloginComponent implements OnInit {
  ex: any;
  loginFailed:boolean=false;
  constructor(private service:NgserviceService,private router:Router) {
    localStorage.removeItem('UserData');
    localStorage.removeItem('DoctorData');
    this.guard();
   }

  ngOnInit(): void {
  }
  //submit patient login and call respective method
submit(value:any){
  console.log(value);
  this.login_patient(value);
}
//for logging in patient
login_patient(value:any){
  this.service.login_patient(value).subscribe(data =>{
    this.ex=data;
    console.log(this.ex);
    if(this.ex.patient_id==0){
      this.loginFailed=true;
      timer(2000).subscribe((d)=>{
        this.loginFailed=false;
      })
    }else{
      localStorage.setItem('PatientData',JSON.stringify(this.ex));
      console.log("logged in");
     
       this.router.navigate(['departments']).then(()=>{
         window.location.reload();
       });
    }
  });
}

//it should not prompt back if logged in
guard(){
  const PatientData=JSON.parse(localStorage.getItem('PatientData')!);
  if(PatientData){
    this.router.navigate(['departments']);
  }
}
}
