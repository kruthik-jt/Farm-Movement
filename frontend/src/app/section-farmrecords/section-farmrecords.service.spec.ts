import { TestBed } from '@angular/core/testing';

import { SectionFarmrecordsService } from './section-farmrecords.service';

describe('SectionFarmrecordsService', () => {
  let service: SectionFarmrecordsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SectionFarmrecordsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
