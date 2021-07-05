import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouteConfigLoadEnd, Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';

@Component({
  selector: 'app-docfordeps',
  templateUrl: './docfordeps.component.html',
  styleUrls: ['./docfordeps.component.css']
})
export class DocfordepsComponent implements OnInit {
   users!: any[];
   id:any;
  constructor(private router :Router,private service:NgserviceService,private route :ActivatedRoute) {
     this.service.login_session();
     this.id=Number(this.route.snapshot.params['departmentId']);
     this.getDocsforDeps(this.id);
   }

  ngOnInit(): void {
  }

  //getting doctors for specific department
  getDocsforDeps(departmentId:any){
    this.service.fetchdeptdocdetails(departmentId).subscribe(data=>{
    this.users=data;
    console.log(data)
    });
  }
  
//redirecting to book appointment page
  bookappointment(doctorId:any)
{
   this.router.navigate(['appointment_form',doctorId]);
}


onlogout(){
   this.service.onlogout();
}
}
