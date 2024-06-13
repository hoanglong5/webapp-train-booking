package com.hoanglong.train_booking.booking.repository;

import com.hoanglong.train_booking.booking.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PassengerRepository extends JpaRepository<Passenger, UUID> {
}
