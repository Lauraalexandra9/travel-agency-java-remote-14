package com.sda.travelagency.travelagency.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Trip {
    LocalDate tripStartDate;

    LocalDate tripEndDate;

    Destination destination;

    Price price;

    TransportType transportType;

    SecurityRules securityRules;

    PaymentType paymentType;

    MealType mealType;

    HotelFacilities hotelFacilities;

    List<String> photos;

    Attraction attraction;

    AgeRestrictions ageRestrictions;







}