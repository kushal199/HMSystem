import { error } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { timer } from 'rxjs';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-doctor-login',
  templateUrl: './doctor-login.component.html',
  styleUrls: ['./doctor-login.component.css']
})
export class DoctorLoginComponent implements OnInit {
   ex:any;
   loginFailed:boolean=false;
  constructor(private service:NgserviceService,private router:Router) {
    localStorage.removeItem('UserData');
    localStorage.removeItem('PatientData');
    this.guard();
   }

  ngOnInit(): void {
  }
//submitting form and call for login
  submit(value:any){
    console.log(value);
    this.login_doctor(value);
  }

  //for login
  login_doctor(value:any){
    this.service.login_doctor(value).subscribe(data=>{
     this.ex=data;
     console.log(this.ex);
     if(this.ex.doctor_id==0){
       //alert("Username And Password did not match,Please try again");
       this.loginFailed=true;
       timer(2000).subscribe((d)=>{
         this.loginFailed=false;
       })
       //this.router.navigate(['doctor_login'])
       //.then(() => {
        //window.location.reload();
      //});
     }else{
       localStorage.setItem('DoctorData',JSON.stringify(this.ex));
       console.log('logged in');
       this.router.navigate(['doctor_dashboard']).then(()=>{
        window.location.reload();
       });
     }
    }
    );
  }

  //not to get into loginpage if already logged in
  guard(){
    const DoctorData=JSON.parse(localStorage.getItem('DoctorData')!);
    if(DoctorData){
      this.router.navigate(['doctor_dashboard']);
    }
  }

}
