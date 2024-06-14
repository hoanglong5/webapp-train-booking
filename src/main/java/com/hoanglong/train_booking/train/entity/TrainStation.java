package com.hoanglong.train_booking.train.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hoanglong.train_booking.booking.entity.Booking;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "train_station")
public class TrainStation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID trainStationId;
    private String stationName;
    @JsonIgnore
    @OneToMany(mappedBy = "trainStation", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JourneyStation> journeyStations;
    @JsonIgnore
    @OneToMany(mappedBy = "startStation", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Booking> startingBookings = new HashSet<>();
    @JsonIgnore
    @OneToMany(mappedBy = "endStation", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Booking> endingBookings = new HashSet<>();
}
