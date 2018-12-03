import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BaseService {

  constructor(private http: HttpClient) { }

  getUserName(){
    return this.http.get("http://localhost:8000/rest/getMyName",{responseType:"text"});
  }
}
