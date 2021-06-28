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

  getDepartment(){
    this.service.fetchdeptdetails().subscribe(data =>{
       this.depts=data;
       console.log(this.depts);
    });
  }
  getUserfromLocal()
  {
    this.PatientData=JSON.parse(localStorage.getItem('PatientData')!);
    console.log(this.PatientData);

}
docsfordept(department_id:any){
    console.log("done");
    this.router.navigate(['docsfordepts',department_id])
}

allappointments(patient_id:any){
this.router.navigate(['allappointments',patient_id]);
}

// login_session(){
//   const PatientData=JSON.parse(localStorage.getItem('PatientData')!);
//   //console.log(userData);
//   if(!PatientData){
//     //return;
//     this.router.navigate(['patient_login']);
//   }
// }
onlogout(){
  // localStorage.removeItem('PatientData');
  // this.router.navigate(['patient_login']);
  this.service.onlogout();
}

edit_patient(){
  this.router.navigate(['edit_patient']);
}


}
