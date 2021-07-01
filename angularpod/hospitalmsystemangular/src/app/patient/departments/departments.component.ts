import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
  styleUrls: ['./departments.component.css']
})
export class DepartmentsComponent implements OnInit {
    depts!: any[];
    PatientData:any;
  constructor(private service:NgserviceService,private router:Router) { 
    this.service.login_session();
    this.getDepartment();
    this.getUserfromLocal();

  }

  ngOnInit(): void {
  }

  //getting all departments
  getDepartment(){
    this.service.fetchdeptdetails().subscribe(data =>{
    this.depts=data;
    console.log(this.depts);
    });
  }

 //getting user from localStorage
  getUserfromLocal()
  {
    this.PatientData=JSON.parse(localStorage.getItem('PatientData')!);
    console.log(this.PatientData);
  }

 //redirecting to other doctors page of specific department
docsfordept(department_id:any){
    console.log("done");
    this.router.navigate(['docsfordepts',department_id])
}

//redirecting to all appointments taken by patient
allappointments(patient_id:any){
this.router.navigate(['allappointments',patient_id]);
}


onlogout(){
  this.service.onlogout();
}

//redirecting to edit page of patient
edit_patient(){
  this.router.navigate(['edit_patient']);
}


}
