import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SectionFarmrecordsComponent } from './section-farmrecords.component';

describe('SectionFarmrecordsComponent', () => {
  let component: SectionFarmrecordsComponent;
  let fixture: ComponentFixture<SectionFarmrecordsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SectionFarmrecordsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SectionFarmrecordsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
