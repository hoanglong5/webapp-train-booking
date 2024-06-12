package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.entity.JourneyStation;
import com.hoanglong.train_booking.train.entity.TrainJourney;
import com.hoanglong.train_booking.train.service.entityservice.JourneyStationEntityService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class JourneyStationServiceTest {
    @Mock
    private JourneyStationEntityService journeyStationEntityService;
    @InjectMocks
    private JourneyStationService journeyStationService;
    private JourneyStation CreateDummyJourneyStation(){
        JourneyStation journeyStation = new JourneyStation();
        journeyStation.setJourneyStationId(UUID.randomUUID());
        journeyStation.setTrainJourney(UUID.randomUUID());
        journeyStation.setTrainStation(UUID.randomUUID());
        journeyStation.setLocalTime(LocalTime.now());
        journeyStation.setStopOrder();
    }

    @Test
    void findAllJourneyStation() {
    }

    @Test
    void findJourneyStation() {
    }

    @Test
    void deleteJourneyStation() {
    }

    @Test
    void saveJourneyStation() {
    }

    @Test
    void updateJourneyStation() {
    }
}