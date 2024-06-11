package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.service.entityservice.ScheduleEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleEntityService scheduleEntityService;
}
