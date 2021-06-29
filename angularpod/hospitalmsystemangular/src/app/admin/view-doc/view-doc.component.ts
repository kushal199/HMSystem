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


  //getting all doctors as a list
  private getUsers(){
    this.service.fetchuserdetails().subscribe(data =>{
      this.users=data;
    }
    );

  }

  //prompting to update page for a particular id
  updateuser(id:number){
    console.log(id);
    this.router.navigate(['update_page' ,id]);
  }


  //checking if the user is active or not
  login_session(){
    const userData=JSON.parse(localStorage.getItem('UserData')!);
    if(!userData){
      this.router.navigate(['loginpage']);
    }
  }

//to delete a particular doctor
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
