package com.hoanglong.train_booking.booking.repository;

import com.hoanglong.train_booking.booking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
}
