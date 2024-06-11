package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.service.entityservice.TrainJourneyEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrainJourneyService {
    private final TrainJourneyEntityService trainJourneyEntityService;
}
