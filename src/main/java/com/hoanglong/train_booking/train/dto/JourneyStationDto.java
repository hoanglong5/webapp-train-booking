package com.hoanglong.train_booking.train.dto;

import com.hoanglong.train_booking.train.entity.TrainJourney;
import com.hoanglong.train_booking.train.entity.TrainStation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JourneyStationDto {
    private UUID journeyStationId;
    private LocalTime departureTime;
    private TrainStation trainStation;
    private TrainJourney trainJourney;
}
