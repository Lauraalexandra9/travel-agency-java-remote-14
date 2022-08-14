package com.sda.travelagency.entity;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public enum AgeRestrictions {
    NO_LIMIT,
    KIDS_ONLY,
    ADULT_ONLY,

}
