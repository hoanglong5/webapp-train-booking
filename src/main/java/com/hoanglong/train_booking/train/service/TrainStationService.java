package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.service.entityservice.TrainStationEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrainStationService {
    private final TrainStationEntityService trainStationEntityService;
}
