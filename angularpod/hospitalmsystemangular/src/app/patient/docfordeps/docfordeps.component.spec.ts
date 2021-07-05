import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DocfordepsComponent } from './docfordeps.component';

describe('DocfordepsComponent', () => {
  let component: DocfordepsComponent;
  let fixture: ComponentFixture<DocfordepsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DocfordepsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DocfordepsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
