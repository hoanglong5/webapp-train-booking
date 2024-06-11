package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.entity.JourneyStation;
import com.hoanglong.train_booking.train.service.entityservice.JourneyStationEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JourneyStationService {
    private final JourneyStationEntityService journeyStationEntityService;
//    public List<JourneyStation> FindAllJourneyStation(){
//    }
//    public JourneyStation FindJourneyStation(UUID uuid){
//    }
    public void DeleteJourneyStation(UUID uuid){}
    public void SaveFindJourneyStation(JourneyStation journeyStation){

    }
    public void UpdateJourneyStation(UUID uuid,JourneyStation journeyStation){

    }
}
