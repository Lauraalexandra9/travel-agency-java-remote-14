import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {TripDto} from "../../models/trips";


@Injectable({
  providedIn: 'root'
})
export class TripService {
// TODO: add correct module to AppModule
  constructor(private http: HttpClient) {
  }

  getAllTrip(): Observable<TripDto[]> {
    return this.http.get<TripDto[]>(allTripsUrl)
  }
}
