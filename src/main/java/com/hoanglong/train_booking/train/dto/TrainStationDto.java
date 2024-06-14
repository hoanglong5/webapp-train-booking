package com.hoanglong.train_booking.train.dto;

import com.hoanglong.train_booking.booking.entity.Booking;
import com.hoanglong.train_booking.train.entity.JourneyStation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainStationDto {
    private UUID trainStationId;
    private Set<JourneyStation> journeyStations;
    private Set<Booking> startingBookings = new HashSet<>();
    private Set<Booking> endingBookings = new HashSet<>();
}
