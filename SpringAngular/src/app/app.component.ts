import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';
import { EmployeesService } from './employees.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public employees!: Employee[];

  constructor(private  employeesService: EmployeesService) { }

  ngOnInit(){
    this.getEmployees
  }
  public getEmployees(): void {
     this.employeesService.getEmployees().subscribe(
       (responce: Employee[]) => {
         this.employees = responce;
        },
        (error: HttpErrorResponse) =>{
          alert(error.message);
        }
        
     );
  }

}
