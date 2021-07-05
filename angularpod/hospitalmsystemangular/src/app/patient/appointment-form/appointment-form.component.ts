import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-appointment-form',
  templateUrl: './appointment-form.component.html',
  styleUrls: ['./appointment-form.component.css']
})
export class AppointmentFormComponent implements OnInit {
  doctorId:any
  ex: any;
  PatientData: any;
  p: any;

  constructor(private service:NgserviceService,private router:Router,private route:ActivatedRoute) { 
   this.service.login_session();
   this.doctorId= Number(this.route.snapshot.params['doctorId']);
   console.log(this.doctorId);
   this.getUserfromLocal();
  }

  ngOnInit(): void {
  }

  //submitting form with form object and call respective function
  submit(value:any){
  console.log(value);
  console.log(this.doctorId);
  this.book(value);
  }

  //function for subscribing function and booking appointment 
  book(value:any){
    this.service.book_appointment(value).subscribe(data =>{
    this.ex=data;
    console.log(this.ex);
    this.router.navigate(['departments']);
     });
  }

  //getting users from localStorage
  getUserfromLocal()
  {
    this.PatientData=JSON.parse(localStorage.getItem('PatientData')!);
    console.log(this.PatientData);
  }


  onlogout(){
    this.service.onlogout();
  }

}
