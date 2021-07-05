import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-patient-landing',
  templateUrl: './patient-landing.component.html',
  styleUrls: ['./patient-landing.component.css']
})
export class PatientLandingComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

}
