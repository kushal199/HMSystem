import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isloggedin=false;
  constructor(private router:Router) { 
    this.loginlogout();
    // location.reload(true);

  }

  ngOnInit(): void {
  }
  loginlogout(){
    console.log("entered");
    const DoctorData=JSON.parse(localStorage.getItem('DoctorData')!);
    const UserData=JSON.parse(localStorage.getItem('UserData')!);
    const PatientData=JSON.parse(localStorage.getItem('PatientData')!);
    if(DoctorData){
      this.isloggedin=true;
      console.log(this.isloggedin);
      
      // this.router.navigate(['doctor_dashboard']).then(()=>{
        
      //   location.reload();
      //   location.reload();
      //   location.reload();
      //   window.stop();
        
      // });
    }else if(!DoctorData){
      this.isloggedin=false;
      console.log(this.isloggedin);
      if(UserData){
        this.isloggedin=true;
      console.log(this.isloggedin);
      
      // this.router.navigate(['dashboard_admin']).then(()=>{
        
      //   window.location.reload();
      //   window.stop();
      // });
      }else if(!UserData){
        this.isloggedin=false;
        console.log(this.isloggedin);
        if(PatientData){
          this.isloggedin=true;
          console.log(this.isloggedin);
          
          // this.router.navigate(['doctor_dashboard']).then(()=>{
            
          //   location.reload();
          //   window.stop();
            
          // });
        }else if(!PatientData){
          this.isloggedin=false;
          console.log(this.isloggedin);
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
