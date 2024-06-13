package com.hoanglong.train_booking.booking.repository;

import com.hoanglong.train_booking.booking.entity.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookingStatusRepository extends JpaRepository<BookingStatus, UUID> {
}
