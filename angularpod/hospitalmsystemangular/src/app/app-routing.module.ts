import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardAdminComponent } from './admin/dashboard-admin/dashboard-admin.component';
import { LoginpageComponent } from './admin/loginpage/loginpage.component';
import { RegistrationDocComponent } from './admin/registration-doc/registration-doc.component';
import { UpdatePageComponent } from './admin/update-page/update-page.component';
import { ViewDocComponent } from './admin/view-doc/view-doc.component';
import { ViewPatComponent } from './admin/view-pat/view-pat.component';
import { DoctorAppointmentsComponent } from './doctor/doctor-appointments/doctor-appointments.component';
import { DoctorDashboardComponent } from './doctor/doctor-dashboard/doctor-dashboard.component';
import { DoctorLoginComponent } from './doctor/doctor-login/doctor-login.component';
import { EditDoctorComponent } from './doctor/edit-doctor/edit-doctor.component';
import { PrescriptionformComponent } from './doctor/prescriptionform/prescriptionform.component';
import { HeaderComponent } from './header/header.component';
import { LandingComponent } from './landing/landing/landing.component';
import { AllAppointmentsComponent } from './patient/all-appointments/all-appointments.component';
import { AppointmentFormComponent } from './patient/appointment-form/appointment-form.component';
import { DepartmentsComponent } from './patient/departments/departments.component';
import { DocfordepsComponent } from './patient/docfordeps/docfordeps.component';
import { EditPatientComponent } from './patient/edit-patient/edit-patient.component';
import { FeedbackformComponent } from './patient/feedbackform/feedbackform.component';
import { PatientLandingComponent } from './patient/patient-landing/patient-landing.component';
import { PatientRegistrationComponent } from './patient/patient-registration/patient-registration.component';
import { PatientloginComponent } from './patient/patientlogin/patientlogin.component';

const routes: Routes = [
  {path:"landing",component:LandingComponent},
  { path: '', redirectTo: 'landing', pathMatch: 'full' },
  {path:"loginpage",component:LoginpageComponent},
  {path:"dashboard_admin",component:DashboardAdminComponent},
  {path:"regpage",component:RegistrationDocComponent},
  {path:"view_doc",component:ViewDocComponent},
  {path:'update_page/:id',component:UpdatePageComponent},
  {path:'view_pat',component:ViewPatComponent},
  {path:"patient_landing",component:PatientLandingComponent},
  {path:'patient_login',component:PatientloginComponent},
  {path:'departments',component:DepartmentsComponent},
  {path:'docsfordepts/:departmentId',component:DocfordepsComponent},
  {path:'appointment_form/:doctorId',component:AppointmentFormComponent},
  {path:'allappointments/:patientId',component:AllAppointmentsComponent},
  {path:'feedbackform/:appointmentId',component:FeedbackformComponent},
  {path:'doctor_login',component:DoctorLoginComponent},
  {path:'doctor_dashboard',component:DoctorDashboardComponent},
  {path:'doctor_appointments',component:DoctorAppointmentsComponent},
  {path:'prescriptionform/:appointmentId',component:PrescriptionformComponent},
  {path:'edit_doctor',component:EditDoctorComponent},
  {path:'patient_registration',component:PatientRegistrationComponent},
  {path:'edit_patient',component:EditPatientComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
