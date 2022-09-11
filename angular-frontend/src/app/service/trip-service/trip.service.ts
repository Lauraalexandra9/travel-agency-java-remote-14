import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {TripDto} from "../../models/trips";
import {allTripsUrl} from "../../models/urls";
//import {allTripsUrl} from "../../models/urls";

@Injectable({
  providedIn: 'root'
})
export class TripService {
  constructor(private http: HttpClient) {
  }

  getAllTrip(): Observable<TripDto[]> {
    return this.http.get<TripDto[]>(allTripsUrl)
  }
}
