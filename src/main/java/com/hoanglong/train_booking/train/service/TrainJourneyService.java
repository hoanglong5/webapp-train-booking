package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.entity.TrainJourney;
import com.hoanglong.train_booking.train.service.entityservice.TrainJourneyEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TrainJourneyService {
    private final TrainJourneyEntityService dao;
    public List<TrainJourney> FindAllTrainJourney(){
        return dao.FindALl();
    }
    public TrainJourney FindTrainJourney(UUID uuid){
        return dao.FindById(uuid);
    }
    public void DeleteTrainJourney(UUID uuid){
        dao.DeleteById(uuid);
    }
    public void SaveTrainJourney(TrainJourney trainJourney){
        dao.Save(trainJourney);
    }
    public void UpdateTrainJourney(UUID uuid,TrainJourney trainJourney){
        TrainJourney trainJourney2Update = dao.FindById(uuid);
        trainJourney2Update.setName(trainJourney.getName());
        trainJourney2Update.setSchedule(trainJourney.getSchedule());
    }
}
