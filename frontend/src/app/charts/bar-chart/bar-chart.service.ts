import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {environment} from '../../../environments/environment'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BarChartService {

  private baseURL = environment.movementUrl;

  constructor(private httpClient: HttpClient) { }

  getBarChartData(): Observable<any[]>{
    return this.httpClient.get<any>(`${this.baseURL}movement-state`);
  }
}
