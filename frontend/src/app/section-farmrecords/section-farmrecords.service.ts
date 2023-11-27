import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class SectionFarmrecordsService {

  private baseURL = environment.farmUrl;

  constructor(private httpClient: HttpClient) { }

  getFarmRecords(): Observable<any[]>{
    return this.httpClient.get<any>(`${this.baseURL}records`);
  }
}
