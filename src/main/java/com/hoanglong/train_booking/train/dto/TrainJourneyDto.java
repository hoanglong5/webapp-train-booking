package com.hoanglong.train_booking.train.dto;

import com.hoanglong.train_booking.booking.entity.Booking;
import com.hoanglong.train_booking.carriage.entity.JourneyCarriage;
import com.hoanglong.train_booking.train.entity.JourneyStation;
import com.hoanglong.train_booking.train.entity.Schedule;
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
public class TrainJourneyDto {
    private UUID trainJourneyId;
    private String name;
    private Schedule schedule;
    Set<JourneyStation> journeyStations = new HashSet<>();
    Set<JourneyCarriage> journeyCarriages = new HashSet<>();
    Set<Booking> bookings = new HashSet<>();
}
