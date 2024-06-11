package com.hoanglong.train_booking.train.repository;

import com.hoanglong.train_booking.train.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ScheduleRepository extends JpaRepository<Schedule, UUID> {
}
