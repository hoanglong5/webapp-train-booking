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
    private final JourneyStationEntityService dao;
    public List<JourneyStation> FindAllJourneyStation(){
        return dao.FindALl();
    }
    public JourneyStation FindJourneyStation(UUID uuid){
        return dao.FindById(uuid);
    }
    public void DeleteJourneyStation(UUID uuid){
        dao.DeleteById(uuid);
    }
    public void SaveJourneyStation(JourneyStation journeyStation){
        dao.Save(journeyStation);
    }
    public void UpdateJourneyStation(UUID uuid,JourneyStation journeyStation){
        JourneyStation journeyStation2Update = dao.FindById(uuid);
        journeyStation2Update.setStopOrder(journeyStation.getStopOrder());
        journeyStation2Update.setDepartureTime(journeyStation.getDepartureTime());
        journeyStation2Update.setTrainJourney(journeyStation.getTrainJourney());
        journeyStation2Update.setTrainStation(journeyStation.getTrainStation());
        dao.Save(journeyStation2Update);
    }
}
