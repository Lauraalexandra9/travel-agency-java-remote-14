package com.sda.travelagency.dto;

import com.sda.travelagency.entity.Attraction;

import java.util.List;

public record HotelFacilitiesDto (
        List<Attraction> attractions,

        List<String> apartmentFacilities

){
}
