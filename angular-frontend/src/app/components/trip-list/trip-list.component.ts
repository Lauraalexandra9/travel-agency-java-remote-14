import { Component, OnInit } from '@angular/core';
import {TripService} from "../../service/trip-service/trip.service";
import {TripDto} from "../../models/trips";

import {delay, tap} from "rxjs";
@Component({
  selector: 'app-trip-list',
  templateUrl: './trip-list.component.html',
  styleUrls: ['./trip-list.component.css']
})
export class TripListComponent implements OnInit {

  trips: Array<TripDto> = []

  constructor(private tripService: TripService) { }

  ngOnInit(): void {
    console.log("trying to obtain data from server...")
    this.tripService.getAllTrip()
      .pipe(
      delay(5000),
        tap(value => console.log("from server: " + value))
      )
      .subscribe(value => this.trips = value)
  }

}
