import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import * as $ from 'jquery';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  
  isloggedin=false;
  constructor(private router:Router) { 
    this.loginlogout();
  }

  ngOnInit(): void {
    $(document).ready(function() {
      $( ".nav-item" ).bind( "click", function(event) {
          event.preventDefault();
          var clickedItem = $( this );
          $( ".nav-item" ).each( function() {
              $( this ).removeClass( "active" );
          });
          clickedItem.addClass( "active" );
      });
  });
  }

  public isMenuCollapsed = true;

  loginlogout(){
    const DoctorData=JSON.parse(localStorage.getItem('DoctorData')!);
    const UserData=JSON.parse(localStorage.getItem('UserData')!);
    const PatientData=JSON.parse(localStorage.getItem('PatientData')!);

    if(DoctorData){
      this.isloggedin=true;
    }
    else if(!DoctorData){
      this.isloggedin=false;
     

      if(UserData){
        this.isloggedin=true;
      
      }
      else if(!UserData){
        this.isloggedin=false;
        
        if(PatientData){
          this.isloggedin=true;
          
        }
        else if(!PatientData){
          this.isloggedin=false;
          
        }
      }
    }
  }

  onlogout(){
    const DoctorData=JSON.parse(localStorage.getItem('DoctorData')!);
    const UserData=JSON.parse(localStorage.getItem('UserData')!);
    const PatientData=JSON.parse(localStorage.getItem('PatientData')!);

    if(DoctorData){
      localStorage.removeItem('DoctorData');
      this.router.navigate(['doctor_login']).then(()=>{
        window.location.reload();
      });
    }else if(UserData){
      localStorage.removeItem('UserData');
      this.router.navigate(['loginpage']).then(()=>{
        window.location.reload();
      });
    }else if(PatientData){
      localStorage.removeItem('PatientData');
      this.router.navigate(['patient_login']).then(()=>{
        window.location.reload();
      });
    }
  }


}
