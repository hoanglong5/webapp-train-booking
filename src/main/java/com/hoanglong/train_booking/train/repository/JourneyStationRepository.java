package com.hoanglong.train_booking.train.repository;

import com.hoanglong.train_booking.train.entity.JourneyStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JourneyStationRepository extends JpaRepository<JourneyStation, UUID> {
}
