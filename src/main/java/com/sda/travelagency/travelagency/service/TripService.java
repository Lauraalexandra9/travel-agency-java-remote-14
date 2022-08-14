package com.sda.travelagency.travelagency.service;

import com.sda.travelagency.travelagency.entity.Trip;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class TripService {
    public List<Trip> findAllTrips() {
        log.info("finding all trips");

        return Collections.emptyList();
    }
}
