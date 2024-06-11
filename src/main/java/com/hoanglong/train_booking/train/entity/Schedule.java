package com.hoanglong.train_booking.train.entity;

import com.hoanglong.train_booking.carriage.entity.CarriagePrice;
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
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID scheduleID;
    private String name;
    @OneToMany(mappedBy = "schedule",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<TrainJourney> trainJourneys = new HashSet<>();
    @OneToMany(mappedBy = "schedule",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<CarriagePrice> carriagePrices = new HashSet<>();
}
