package com.hoanglong.train_booking.train.entity;

import com.hoanglong.train_booking.booking.entity.Booking;
import com.hoanglong.train_booking.carriage.entity.JourneyCarriage;
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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "train_journey")
public class TrainJourney {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID trainJourneyId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "schedule_id",nullable = false)
    private Schedule schedule;
    @OneToMany(mappedBy = "trainJourney",cascade = CascadeType.ALL,orphanRemoval = true)
    Set<JourneyStation> journeyStations = new HashSet<>();
    @OneToMany(mappedBy = "trainJourney",cascade = CascadeType.ALL,orphanRemoval = true)
    Set<JourneyCarriage> journeyCarriages = new HashSet<>();
    @OneToMany(mappedBy = "trainJourney",cascade = CascadeType.ALL,orphanRemoval = true)
    Set<Booking> bookings = new HashSet<>();
}
