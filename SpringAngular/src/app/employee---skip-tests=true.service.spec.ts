import { TestBed } from '@angular/core/testing';

import { EmployeeSkipTests=trueService } from './employee---skip-tests=true.service';

describe('EmployeeSkipTests=trueService', () => {
  let service: EmployeeSkipTests=trueService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployeeSkipTests=trueService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
