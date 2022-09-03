package com.sda.travelagency.entity;

import com.sda.travelagency.entity.enumeration.AgeRestrictions;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.*;

import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
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