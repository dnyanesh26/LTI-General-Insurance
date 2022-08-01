import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class PolicyHttpClientService {

  baseUrl="http://localhost:8090/policy-api";
  

  constructor(private http:HttpClient) { }


  policyReg(policy: any) {
    const requestOptions: Object = {
      /* other options here */
      responseType: 'text'

    }
   
    return this.http.post<any>(this.baseUrl+'/addPolicy',policy,requestOptions)
  }
}