package com.hoanglong.train_booking.booking.entity;

import com.hoanglong.train_booking.booking.enums.BookingStatusEnums;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking_status")
public class BookingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookingStatusId;
    @Enumerated(EnumType.STRING)
    private BookingStatusEnums bookingStatus;
}
