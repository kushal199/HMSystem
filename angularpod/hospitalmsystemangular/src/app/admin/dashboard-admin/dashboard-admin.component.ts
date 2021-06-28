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

  //session checking if doctor is logged in or not
  login_session(){
    const userData=JSON.parse(localStorage.getItem('UserData')!);
    if(!userData){
      this.router.navigate(['loginpage']);
    }
  }

 
}
