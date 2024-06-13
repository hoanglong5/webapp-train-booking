package com.hoanglong.train_booking.carriage.repository;

import com.hoanglong.train_booking.carriage.entity.CarriagePrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarriagePriceRepository extends JpaRepository<CarriagePrice, UUID> {
}
