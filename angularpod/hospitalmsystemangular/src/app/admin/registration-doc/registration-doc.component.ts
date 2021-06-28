import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';
import { User } from 'src/app/user';

@Component({
  selector: 'app-registration-doc',
  templateUrl: './registration-doc.component.html',
  styleUrls: ['./registration-doc.component.css']
})
export class RegistrationDocComponent implements OnInit {
  ex: any;
  //creating a object
  u:User=new User();

  constructor(private service:NgserviceService,private router:Router) {
    this.login_session();
   }


  ngOnInit(): void {
  }

  //submitting registration form 
  submit(value:any){
    console.log(value);
    this.save(value);
    this.router.navigate(['view_doc'])
    .then(()=>{
       window.location.reload();
    });
  }

  //method taking a object as input to registration and getting a output 1 if data has inserted in database successfully
  save(value:any){
    this.service.doctor_reg(value).subscribe(data=>{
      this.ex=data;
      console.log(this.ex);
    });
  }


//checking if the session is available or not
  login_session(){
    const userData=JSON.parse(localStorage.getItem('UserData')!);
    if(!userData){
      this.router.navigate(['loginpage']);
    }
   
  }

}
