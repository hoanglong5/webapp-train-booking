package com.hoanglong.train_booking.train.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "journey_station")
public class JourneyStation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID journeyStationId;
    private int stopOrder;
    private LocalTime departureTime;
    @ManyToOne
    @JoinColumn(name = "station_id",nullable = false)
    private TrainStation trainStation;
    @ManyToOne
    @JoinColumn(name = "journey_id",nullable = false)
    private TrainJourney trainJourney;
}
