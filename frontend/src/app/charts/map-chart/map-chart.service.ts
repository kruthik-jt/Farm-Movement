import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MapChartService {

  private baseURL = environment.movementUrl;

  constructor(private httpClient: HttpClient) { }

  getMovementCoordinates(): Observable<any[]>{
    return this.httpClient.get<any>(`${this.baseURL}coordinates`);
  }
}
