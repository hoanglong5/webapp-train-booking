package com.hoanglong.train_booking.booking.entity;

import com.hoanglong.train_booking.carriage.entity.CarriageClass;
import com.hoanglong.train_booking.train.entity.TrainJourney;
import com.hoanglong.train_booking.train.entity.TrainStation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookingId;
    private LocalDateTime bookingDate;
    private int amountPaid;
    private int ticketNo;
    private String seatNo;
    @ManyToOne
    @JoinColumn(name = "passenger_id",nullable = false)
    private Passenger passenger;
    @ManyToOne
    @JoinColumn(name = "status_id",nullable = false)
    private BookingStatus bookingStatus;
    @ManyToOne
    @JoinColumn(name = "starting_station_id",referencedColumnName = "trainStationId",nullable = false)
    private TrainStation startStation;
    @ManyToOne
    @JoinColumn(name = "ending_station_id",referencedColumnName = "trainStationId",nullable = false)
    private TrainStation endStation;
    @ManyToOne
    @JoinColumn(name = "train_journey_id",nullable = false)
    private TrainJourney trainJourney;
    @ManyToOne
    @JoinColumn(name = "ticket_class_id",nullable = false)
    private CarriageClass carriageClass;
}
