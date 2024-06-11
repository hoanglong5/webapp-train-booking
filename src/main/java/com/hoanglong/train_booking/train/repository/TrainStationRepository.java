package com.hoanglong.train_booking.train.repository;

import com.hoanglong.train_booking.train.entity.TrainStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainStationRepository extends JpaRepository<TrainStation, UUID> {
}
