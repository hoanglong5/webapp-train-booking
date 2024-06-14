package com.hoanglong.train_booking.train.dto;

import com.hoanglong.train_booking.carriage.entity.CarriagePrice;
import com.hoanglong.train_booking.train.entity.TrainJourney;
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
public class ScheduleDto {
    private UUID scheduleId;
    private String name;
    private Set<TrainJourney> trainJourneys = new HashSet<>();
    private Set<CarriagePrice> carriagePrices = new HashSet<>();
}
