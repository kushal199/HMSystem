import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';
import { User } from 'src/app/user';

@Component({
  selector: 'app-dashboard-admin',
  templateUrl: './dashboard-admin.component.html',
  styleUrls: ['./dashboard-admin.component.css']
})
export class DashboardAdminComponent implements OnInit {
  u:User = new User();
  constructor(private router:Router,private service:NgserviceService) { 
   this.login_session();
  }

  ngOnInit(): void {
  }
  login_session(){
    const userData=JSON.parse(localStorage.getItem('UserData')!);
    //console.log(userData);
    if(!userData){
      //return;
      this.router.navigate(['loginpage']);
    }
    // let loggedinUser =new User();
    // loggedinUser=userData;
    // console.log(loggedinUser);
    // if(loggedinUser.doctor_id!=0){
    //    this.u=loggedinUser;
    //    //this.router.navigate(['dashboard_admin']);
    // }
  }
  onlogout(){
    localStorage.removeItem('UserData');
    this.router.navigate(['loginpage']);
  }

}
