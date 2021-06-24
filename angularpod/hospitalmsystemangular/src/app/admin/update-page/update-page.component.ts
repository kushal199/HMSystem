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

  submit(value:any){
    console.log(value);
    this.save(value);
  }
  private getUser(id:number){
    this.service.getOne(id).subscribe(data =>{
      this.user=data;
      console.log(this.user);

    }
      // data=> console.log("response recieved"),
      // error=> console.log("error recieved")

    );

  }
  save(value:any){
    this.service.doctor_update(value).subscribe(data=>{
      this.ex=data;
      console.log(this.ex);
      this.router.navigate(['view_doc']);
    });
  }

  onlogout(){
    localStorage.removeItem('UserData');
    this.router.navigate(['loginpage']);
  }

  login_session(){
    const userData=JSON.parse(localStorage.getItem('UserData')!);
    //console.log(userData);
    if(!userData){
      //return;
      this.router.navigate(['loginpage']);
    }
    let loggedinUser =new User();
    loggedinUser=userData;
    console.log(loggedinUser);
    if(loggedinUser.doctor_id!=0){
       this.u=loggedinUser;
       //this.router.navigate(['dashboard_admin']);
    }
  }




}
