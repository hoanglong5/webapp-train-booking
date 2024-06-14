package com.hoanglong.train_booking.carriage.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "carriage_class")
public class CarriageClass {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID carriageClassId;
    private String className;
    private int seatingCapacity;
    @JsonIgnore
    @OneToMany(mappedBy = "carriageClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CarriagePrice> carriagePrices = new HashSet<>();
    @JsonIgnore
    @OneToMany(mappedBy = "carriageClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JourneyCarriage> journeyCarriages = new HashSet<>();
    @JsonIgnore
    @OneToMany(mappedBy = "carriageClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Booking> bookings = new HashSet<>();
}
