import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingComponent } from './landing/landing/landing.component';
import { LoginpageComponent } from './admin/loginpage/loginpage.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { DashboardAdminComponent } from './admin/dashboard-admin/dashboard-admin.component';
import { RegistrationDocComponent } from './admin/registration-doc/registration-doc.component';
import { ViewDocComponent } from './admin/view-doc/view-doc.component';
import { UpdatePageComponent } from './admin/update-page/update-page.component';
import { PatientloginComponent } from './patient/patientlogin/patientlogin.component';
import { PatientLandingComponent } from './patient/patient-landing/patient-landing.component';
import { DepartmentsComponent } from './patient/departments/departments.component';
import { DocfordepsComponent } from './patient/docfordeps/docfordeps.component';
import { AppointmentFormComponent } from './patient/appointment-form/appointment-form.component';
import { AllAppointmentsComponent } from './patient/all-appointments/all-appointments.component';
import { FeedbackformComponent } from './patient/feedbackform/feedbackform.component';
import { DoctorLoginComponent } from './doctor/doctor-login/doctor-login.component';
import { DoctorDashboardComponent } from './doctor/doctor-dashboard/doctor-dashboard.component';
import { DoctorAppointmentsComponent } from './doctor/doctor-appointments/doctor-appointments.component';
import { PrescriptionformComponent } from './doctor/prescriptionform/prescriptionform.component';
import { EditDoctorComponent } from './doctor/edit-doctor/edit-doctor.component';
import { PatientRegistrationComponent } from './patient/patient-registration/patient-registration.component';
import { EditPatientComponent } from './patient/edit-patient/edit-patient.component';
import { ViewPatComponent } from './admin/view-pat/view-pat.component';
import { HeaderComponent } from './header/header.component';

//import { PatientLoginComponent } from './patient-login/patient-login.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    LoginpageComponent,
    DashboardAdminComponent,
    RegistrationDocComponent,
    ViewDocComponent,
    UpdatePageComponent,
    PatientloginComponent,
    PatientLandingComponent,
    DepartmentsComponent,
    DocfordepsComponent,
    AppointmentFormComponent,
    AllAppointmentsComponent,
    FeedbackformComponent,
    DoctorLoginComponent,
    DoctorDashboardComponent,
    DoctorAppointmentsComponent,
    PrescriptionformComponent,
    EditDoctorComponent,
    PatientRegistrationComponent,
    EditPatientComponent,
    ViewPatComponent,
    HeaderComponent
    //PatientLoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
