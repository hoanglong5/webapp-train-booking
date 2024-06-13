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
    public List<JourneyStation> FindAllJourneyStation(){
        return journeyStationEntityService.FindALl();
    }
    public JourneyStation FindJourneyStation(UUID uuid){
        return journeyStationEntityService.FindById(uuid);
    }
    public void DeleteJourneyStation(UUID uuid){
        journeyStationEntityService.DeleteById(uuid);
    }
    public void SaveJourneyStation(JourneyStation journeyStation){
        journeyStationEntityService.Save(journeyStation);
    }
    public void UpdateJourneyStation(UUID uuid,JourneyStation updatedJourneyStation){
        JourneyStation journeyStation = journeyStationEntityService.FindById(uuid);
        journeyStation.setStopOrder(updatedJourneyStation.getStopOrder());
        journeyStation.setDepartureTime(updatedJourneyStation.getDepartureTime());
        journeyStation.setTrainJourney(updatedJourneyStation.getTrainJourney());
        journeyStation.setTrainStation(updatedJourneyStation.getTrainStation());
        journeyStationEntityService.Save(journeyStation);
    }
}
