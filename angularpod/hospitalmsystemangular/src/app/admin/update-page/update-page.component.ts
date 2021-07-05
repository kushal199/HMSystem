import { Component, OnInit } from '@angular/core';
import { NgserviceService } from 'src/app/ngservice.service';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from 'src/app/user';

@Component({
  selector: 'app-update-page',
  templateUrl: './update-page.component.html',
  styleUrls: ['./update-page.component.css']
})
export class UpdatePageComponent implements OnInit {
  //declaring variables
  id!: number;
  user: User= new User();
  ex: any;
  u:User=new User();
  
  constructor(private service:NgserviceService,private router:Router,private route: ActivatedRoute) {
    this.login_session();
   }


  ngOnInit(): void {
    this.id = Number(this.route.snapshot.params['id']);
    console.log(this.id);
    this.getUser(this.id);
  }


  //submitting form to update to reflect in db
  submit(value:any){
    console.log(value);
    this.save(value);
  }

  //getting user for particular doctor id 
  private getUser(id:number){
    this.service.getOne(id).subscribe(data =>{
      this.user=data;
      console.log(this.user);
    } 
    );
  }

  //interacting with service to update a particular doctor
  save(value:any){
    this.service.doctor_update(value).subscribe(data=>{
      this.ex=data;
      console.log(this.ex);
      this.router.navigate(['view_doc']);
    });
  }

//checking if admin is logged in or not
  login_session(){
    const userData=JSON.parse(localStorage.getItem('UserData')!);
    if(!userData){
      this.router.navigate(['loginpage']);
    }
  }

}
