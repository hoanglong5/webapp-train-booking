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
    private final TrainJourneyEntityService trainJourneyEntityService;
    public List<TrainJourney> FindAllTrainJourney(){
        return trainJourneyEntityService.FindALl();
    }
    public TrainJourney FindTrainJourney(UUID uuid){
        return trainJourneyEntityService.FindById(uuid);
    }
    public void DeleteTrainJourney(UUID uuid){
        trainJourneyEntityService.DeleteById(uuid);
    }
    public void SaveTrainJourney(TrainJourney trainJourney){
        trainJourneyEntityService.Save(trainJourney);
    }
    public void UpdateTrainJourney(UUID uuid,TrainJourney updatedTrainJourney){
        TrainJourney trainJourney = trainJourneyEntityService.FindById(uuid);
        trainJourney.setName(updatedTrainJourney.getName());
        trainJourney.setSchedule(updatedTrainJourney.getSchedule());
        trainJourneyEntityService.Save(trainJourney);
    }
}
