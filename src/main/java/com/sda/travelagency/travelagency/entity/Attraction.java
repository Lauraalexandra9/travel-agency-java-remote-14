package com.sda.travelagency.travelagency.entity;

import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Attraction {
    String description;

    AgeRestrictions ageRestrictions;

    List<String> photos;

}
