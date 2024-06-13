package com.hoanglong.train_booking.carriage.repository;

import com.hoanglong.train_booking.carriage.entity.JourneyCarriage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JourneyCarriageRepository extends JpaRepository<JourneyCarriage, UUID> {
}
