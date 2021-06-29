import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';
import { User } from 'src/app/user';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit {
  ex:any;

  constructor(private service:NgserviceService,private router:Router) {

    //removing other sessions if available
    localStorage.removeItem('PatientData');
    localStorage.removeItem('DoctorData');
    this.guard();
   }

  ngOnInit(): void {
  }


  //after clicking login button submitting form
  submit(value:any){
    console.log(value);
    this.login_admn(value);
  }


  //checking credentials of admin to go forward .If credentials are right it will go to dashboard else a popup
  //will come of inavalid credentials
  login_admn(value:any){
    this.service.login_admin(value).subscribe(data =>{
      this.ex=data;
      console.log(this.ex);
      if(this.ex.user_id==0){
        alert("invalid username and password");
        this.router.navigate(['loginpage']);
      }else{
        localStorage.setItem('UserData',JSON.stringify(this.ex));
         this.router.navigate(['dashboard_admin']).then(()=>{
          window.location.reload();
         });
      }
    });
  }
  
  
  //a session guard so that if admin is logged in state and he/she goes to login page it should
  //redirect to the dashboard because he is already logged in
  guard(){
    const UserData=JSON.parse(localStorage.getItem('UserData')!);
    if(UserData){
      this.router.navigate(['dashboard_admin']);
    }
  }
 

}
