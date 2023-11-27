import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PieChartService {

  private baseURL = environment.addressUrl;

  constructor(private httpClient: HttpClient) { }

  getFarmStatesData(): Observable<any[]>{
    return this.httpClient.get<any>(`${this.baseURL}states`);
  }
}
