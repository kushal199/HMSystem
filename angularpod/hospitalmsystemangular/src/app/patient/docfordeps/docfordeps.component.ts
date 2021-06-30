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
     this.id=Number(this.route.snapshot.params['department_id']);
    this.getDocsforDeps(this.id);

   }

  ngOnInit(): void {
  }


  getDocsforDeps(department_id:any){
    this.service.fetchdeptdocdetails(department_id).subscribe(data=>{
       this.users=data;
       console.log(data)
    });
  }
  
  bookappointment(doctor_id:any)
{
   this.router.navigate(['appointment_form',doctor_id]);
}
onlogout(){
   this.service.onlogout();
}
}
