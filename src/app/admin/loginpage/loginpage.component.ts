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
  // ex:User=new User();
  ex:any;
  // u:User=new User();

  constructor(private service:NgserviceService,private router:Router) {
    localStorage.removeItem('DoctorData');
    localStorage.removeItem('PatientData');
   }

  ngOnInit(): void {
  }
  submit(value:any){
    console.log(value);
    this.login_admn(value);
    //this.router.navigate(['loginpage']);
  }

  login_admn(value:any){
    this.service.login_admin(value).subscribe(data =>{
      this.ex=data;
      
      
      console.log(this.ex);
      if(this.ex.user_id==0){
        alert("invalid username and password");
        this.router.navigate(['loginpage']);
      }else{
        localStorage.setItem('UserData',JSON.stringify(this.ex));
        this.login_session();
        //const userData=JSON.parse(localStorage.getItem('UserData')!);
        //console.log(userData);
       
        // this.router.navigate(['dashboard_admin']);
      }
    });
  }
  login_session(){
    const userData=JSON.parse(localStorage.getItem('UserData')!);
    //console.log(userData);
    if(!userData){
      return;
    }
    // let loggedinUser =new User();
    // loggedinUser=userData;
    // console.log(loggedinUser);
    // if(loggedinUser.doctor_id!=0){
    //    this.u=loggedinUser;
        this.router.navigate(['dashboard_admin']).then(()=>{
          window.location.reload();
        });
    // }
  }
  
 

}
