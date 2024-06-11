package com.hoanglong.train_booking.train.repository;

import com.hoanglong.train_booking.train.entity.TrainJourney;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainJourneyRepository extends JpaRepository<TrainJourney, UUID> {
}
