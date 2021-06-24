import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrationDocComponent } from './registration-doc.component';

describe('RegistrationDocComponent', () => {
  let component: RegistrationDocComponent;
  let fixture: ComponentFixture<RegistrationDocComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrationDocComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistrationDocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
