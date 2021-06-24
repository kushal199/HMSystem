import { error } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-doctor-login',
  templateUrl: './doctor-login.component.html',
  styleUrls: ['./doctor-login.component.css']
})
export class DoctorLoginComponent implements OnInit {
   ex:any;
  constructor(private service:NgserviceService,private router:Router) { }

  ngOnInit(): void {
  }

  submit(value:any){
    console.log(value);
    this.login_doctor(value);
  }

  login_doctor(value:any){
    this.service.login_doctor(value).subscribe(data=>{
     this.ex=data;
     console.log(this.ex);
     if(this.ex.doctor_id==0){
       alert("Username And Password did not match,Please try again");
       this.router.navigate(['doctor_login'])
       .then(() => {
        window.location.reload();
      });
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

}
