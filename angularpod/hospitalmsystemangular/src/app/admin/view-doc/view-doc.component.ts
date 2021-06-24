import { Component, OnInit } from '@angular/core';
import { NgserviceService } from 'src/app/ngservice.service';
import { Router } from '@angular/router';
import { User } from 'src/app/user';

@Component({
  selector: 'app-view-doc',
  templateUrl: './view-doc.component.html',
  styleUrls: ['./view-doc.component.css']
})
export class ViewDocComponent implements OnInit {
  users!: User[];
  u:User=new User();
  id: any;
  constructor(private service:NgserviceService,private router:Router) { 
    this.login_session();
  }

  ngOnInit(): void {
    this.getUsers();
  }

  private getUsers(){
    this.service.fetchuserdetails().subscribe(data =>{
      this.users=data;
    }
      // data=> console.log("response recieved"),
      // error=> console.log("error recieved")

    );

  }
  updateuser(id:number){
    console.log(id);
    this.router.navigate(['update_page' ,id]);
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

  deleteuser(id:number){
    this.service.doctor_delete(id).subscribe(data=>{
         this.id=data;
         console.log(id);
         this.router.navigate(['view_doc'])
         .then(() => {
          window.location.reload();
        });
    });
  }

}
