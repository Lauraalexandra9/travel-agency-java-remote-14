import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";


@Injectable({
  providedIn: 'root'
})
export class TripService {
// TODO: add correct module to AppModule
  constructor(private http: HttpClient) { }

  getAllTrip(): any {
    this.http.get<any[]>(allTripsUrl)
  }
}
