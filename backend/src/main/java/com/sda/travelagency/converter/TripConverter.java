
package com.sda.travelagency.converter;

        import com.sda.travelagency.dto.DestinationDto;
        import com.sda.travelagency.dto.TripDto;
        import com.sda.travelagency.entity.Trip;
        import org.springframework.stereotype.Component;

@Component
public class TripConverter implements Converter<Trip, TripDto> {

    private final DestinationConverter destinationConverter;

    private final SecurityRulesConverter securityRulesConverter;

    public TripConverter(DestinationConverter destinationConverter, SecurityRulesConverter securityRulesConverter){
        this.destinationConverter = destinationConverter;
        this.securityRulesConverter = securityRulesConverter;
    }

    @Override
    public TripDto fromEntityToDto(Trip trip) {
       var DestinationDto destinationDto = destinationConverter.fromEntityToDto(trip.getDestination());
       var security

               
        return TripDto.builder()
                .tripStartDate(trip.getTripStartDate())
                .tripEndDate(trip.getTripEndDate())
                .destination(destinationDto)
                .cost(trip.getPrice().getCost().toString())
                .cost(trip.getTripPrice().getCurrency())
                .typeOfTransport(trip.getTransportType())
                .securityRules()//todo
                .paymentType(trip.getPaymentType())
                .mealType(trip.getMealType())
                .hotelFacilities()
                .photos(trip.getPhotos())
                .build();
    }

    @Override
    public Trip fromDtoToEntity(TripDto tripDto) {
        return null;
    }
}