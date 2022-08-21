package com.sda.travelagency.entity;

import com.sda.travelagency.entity.enumeration.AgeRestrictions;
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
