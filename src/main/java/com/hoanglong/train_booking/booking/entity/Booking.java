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
    private UUID bookingID;
    private LocalDateTime bookingDate;
    private int amountPaid;
    private int ticketNo;
    private String seatNo;
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;
    @ManyToOne
    @JoinColumn(name = "booking_status_id")
    private BookingStatus bookingStatus;
    @ManyToOne
    @JoinColumn(name = "train_station_id")
    private TrainStation startStation;
    @ManyToOne
    @JoinColumn(name = "train_station_id")
    private TrainStation endStation;
    @ManyToOne
    @JoinColumn(name = "train_journey_id")
    private TrainJourney trainJourney;
    @ManyToOne
    @JoinColumn(name = "carriage_class_id")
    private CarriageClass carriageClass;
}
