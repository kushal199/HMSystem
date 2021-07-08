import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class NgserviceService {
  // private baseURL = 'http://localhost:8080/';
  constructor(private _http:HttpClient,private router:Router) { }
  
//admin part service
  fetchuserdetails():Observable<any>{
    return this._http.get<any>("http://localhost:8080/view_doc");
  }
  getOne(id:number):Observable<any>{
    return this._http.post<any>("http://localhost:8080/new_user",id);
  }
  login_admin(admin:Object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/login-admin",admin);
  }
  fetchPatientdetails():Observable<any>{
    return this._http.get<any>("http://localhost:8080/view_patients");
  }

   doctor_reg(user:Object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/save",user);
  }
  doctor_update(user:Object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/update",user);

  }

  doctor_delete(id:number):Observable<any>{
    return this._http.post<any>("http://localhost:8080/delete-user",id);
  }

 

  //patient service

  login_patient(patient:Object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/login_patient",patient);
  }

  register_patient(patient:Object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/save_patient",patient);
  }

  patient_update(patient:Object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/update_patient",patient);

  }
  
  fetchdeptdetails():Observable<any>{
    return this._http.get<any>("http://localhost:8080/view_department");
  }

  fetchdeptdocdetails(departmentId:any):Observable<any>{
    return this._http.post<any>("http://localhost:8080/doctorfordep",departmentId);
  }

  book_appointment(appointment:Object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/save_appointment",appointment);
  }

  fetchappointmentForPatientdetails(patientId:any):Observable<any>{
    return this._http.post<any>("http://localhost:8080/appointments",patientId);
  }

  updatefeedback(appointment:object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/update_feedback",appointment);
  }

  checkPatientUsername(username:any):Observable<any>{
    return this._http.post<any>("http://localhost:8080/patient/check_username",username);
  }



  //for doctor service
  login_doctor(user:Object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/login-user",user);
  }


  fetchappointmentForDoctor(doctorId:any):Observable<any>{
    return this._http.post<any>("http://localhost:8080/appointmentsForDoc",doctorId);
  }

  fetchappointmentForUpcoming(doctorId:any):Observable<any>{
    return this._http.post<any>("http://localhost:8080/appointmentsForDocUpcoming",doctorId);
  }
  fetchappointmentForPrev(doctorId:any):Observable<any>{
    return this._http.post<any>("http://localhost:8080/appointmentsForDocPrev",doctorId);
  }

 
  checkDoctorUsername(username:any):Observable<any>{
    return this._http.post<any>("http://localhost:8080/doctor/check_username",username);
  }


  updateprescription(appointment:object):Observable<any>{
    return this._http.post<any>("http://localhost:8080/update_prescription",appointment);
  }

 
 //patient reusable session custom 
  onlogout(){
    localStorage.removeItem('PatientData');
    this.router.navigate(['patient_login']);
  }

  login_session(){
    const PatientData=JSON.parse(localStorage.getItem('PatientData')!);
    //console.log(userData);
    if(!PatientData){
      //return;
      this.router.navigate(['patient_login']);
    }
  }



  //Doctor Reusable Session onlogout(){
    onlogout_doctor(){
      localStorage.removeItem('DoctorData');
      this.router.navigate(['doctor_login']);
    }
  
    login_session_doctor(){
      const DoctorData=JSON.parse(localStorage.getItem('DoctorData')!);
      //console.log(userData);
      if(!DoctorData){
        //return;
        this.router.navigate(['doctor_login']);
      }
    }


}
